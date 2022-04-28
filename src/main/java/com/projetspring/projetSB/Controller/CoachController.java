package com.projetspring.projetSB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetspring.projetSB.Entity.Coach;
import com.projetspring.projetSB.Service.Coach.CoachService;

@CrossOrigin("*")
@RestController
@RequestMapping(value="api/coach" )
public class CoachController {
	
	@Autowired
	private CoachService coachService;
	
	@PostMapping("/addCoach")  
	 public Coach addCoach(@RequestBody Coach e)
	 
	 {
		 return coachService.addCoach(e);
	 }
	 
	@GetMapping("/coachs")
	 public List<Coach> getAllCoachs()
	 {
		//System.out.print("hello");
		 return coachService.getAllCoachs();
	 }
	
	@PutMapping("/updateCoach")
	 public Coach updateCoach(@RequestBody Coach p)
	 {
		 return coachService.updateCoach(p);
	 }
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity< Coach> deleteCoach(@PathVariable long id)
	{
		return coachService.deleteCoach(id); 
	}
	
	@GetMapping("/{id}") 
	 public Coach getEmployeeById(@PathVariable Long id)
	 {
		 return coachService.getCoach(id);
	 } 
	 
//	@GetMapping("/personneByName/{name}")
//	 public Optional<Personne> getEmployeeByName(@PathVariable String name)
//	 {
//		 return Personne((PersonneController) personneService).getEmployeeByName(name);
//	 }

}

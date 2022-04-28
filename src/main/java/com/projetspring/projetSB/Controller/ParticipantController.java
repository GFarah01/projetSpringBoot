package com.projetspring.projetSB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.projetspring.projetSB.Entity.Participant;
import com.projetspring.projetSB.Service.Coach.CoachService;
import com.projetspring.projetSB.Service.Participant.ParticipantService;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping(value="api/participant" , consumes = { "application/json" })
public class ParticipantController {

	
	@Autowired
	private ParticipantService Service;
	
	@PostMapping("/addParticipant")  
	 public Participant addParticipant(@RequestBody Participant e)
	 {
		 return Service.addParticipant(e);
	 }
	 
	@GetMapping("/participants")
	 public List<Participant> getAllParticipants()
	 {
		//System.out.print("hello");
		 return Service.getAllParticipants();
	 }
	
	@PutMapping("/updateParticipant")
	 public Participant updateParticipant(@RequestBody Participant p)
	 {
		 return Service.updateParticipant(p);
	 }
	
	@DeleteMapping("/delete/{id}")
	public String deleteParticipant(@PathVariable long id)
	{
		return Service.deleteParticipant(id); 
	}
	
//	@GetMapping("/employees/{id}") 
//	 public Employee getEmployeeById(@PathVariable Long id)
//	 {
//		 return employeeService.getEmployee(id);
//	 } 
	 
//	@GetMapping("/personneByName/{name}")
//	 public Optional<Personne> getEmployeeByName(@PathVariable String name)
//	 {
//		 return Personne((PersonneController) personneService).getEmployeeByName(name);
//	 }

	
}

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
import com.projetspring.projetSB.Entity.Seance;
import com.projetspring.projetSB.Service.Seance.SeanceService;

@CrossOrigin("*")
@RestController
@RequestMapping(value="api/seance")
public class SeanceController {

	@Autowired
	private SeanceService Service;
	
	@PostMapping("/addSeance")  
	 public Seance addSeance(@RequestBody Seance e)
	 {
		 return Service.addSeance(e);
	 }
	 
	@GetMapping("/Seances")
	 public List<Seance> getAllSeances()
	 {
		 return Service.getAllSeances();
	 }
	
	@GetMapping("/{id}") 
	 public Seance getSeanceById(@PathVariable Long id)
	 {
		 return Service.getSeance(id);
	 } 
	
	@PutMapping("/updateSeance")
	 public Seance updateSeance(@RequestBody Seance p)
	 {
		 return Service.updateSeance(p); 
	 }
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity< Seance> deleteSeance(@PathVariable long id)
	{
		return Service.deleteSeance(id); 
	}
}

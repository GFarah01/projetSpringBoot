package com.projetspring.projetSB.Service.Coach;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.projetspring.projetSB.Entity.Coach;
import com.projetspring.projetSB.Repository.CoachRepository;

@Service
public class CoachServiceImpl implements CoachService{

	@Autowired
	private CoachRepository coachRepository;
	
	public List<Coach> getAllCoachs() {
		
		return coachRepository.findAll(); 
	}
	
	public Coach addCoach(Coach e)
	{
		return coachRepository.save(e);
	}
	
	public Coach getCoach(long id)
	{
		return coachRepository.findById(id).orElse(null);
	}
	
//	public Employee getEmployeeByName(String name)
//	{
//		return employeeRepository.findByName(name);
//	}
	
	public ResponseEntity<Coach> deleteCoach(long id)
	{
		coachRepository.deleteById(id);
		return new ResponseEntity< Coach>(HttpStatus.OK);      
	}
	
	public Coach updateCoach(Coach e)
	{
		Coach ee = coachRepository.findById(e.getId_personne()).orElse(null);
		ee.setFirstName(e.getFirstName());
		ee.setLastName(e.getLastName());
		ee.setEmail(e.getEmail());
		ee.setAge(e.getAge());
		ee.setSpecialite(e.getSpecialite());
		
		return coachRepository.save(ee);
	}
	
}
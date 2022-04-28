package com.projetspring.projetSB.Service.Participant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetspring.projetSB.Entity.Participant;
import com.projetspring.projetSB.Repository.ParticipantRepository;

@Service
public class ParticipantServiceImpl implements ParticipantService{

	@Autowired
	private ParticipantRepository repo;
	
	public List<Participant> getAllParticipants() {
		
		return repo.findAll(); 
	}
	
	public Participant addParticipant(Participant e)
	{
		return repo.save(e);
	}
	
	public Participant updateParticipant(Participant e)
	{
		Participant ee = repo.findById(e.getId_personne()).orElse(null);
		ee.setFirstName(e.getFirstName());
		ee.setLastName(e.getLastName());
		ee.setEmail(e.getEmail());
		ee.setAge(e.getAge());
		ee.setDescription_prob(e.getDescription_prob());
		
		return repo.save(ee);
	}
	
	public String deleteParticipant(long id)
	{
		repo.deleteById(id);
		 return "suppression effectuée ";
	}
	  
	
//	public Optional<Employee> getEmployee(long id)
//	{
//		return employeeRepository.findById(id);
//	}
	
//	public Employee getEmployeeByName(String name)
//	{
//		return employeeRepository.findByName(name);
//	}
	
	

}

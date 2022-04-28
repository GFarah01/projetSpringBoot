package com.projetspring.projetSB.Service.Personne;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projetspring.projetSB.Entity.Personne;
import com.projetspring.projetSB.Repository.PersonneRepository;

@Service
public class PersonneServiceImpl implements PersonneService{

	@Autowired
	private PersonneRepository personneRepository;
	
	public List<Personne> getAllPersonnes() {
		
		return personneRepository.findAll(); 
	}
	
	public Personne addPersonne(Personne e)
	{
		return personneRepository.save(e);
	}
	
//	public Optional<Employee> getEmployee(long id)
//	{
//		return employeeRepository.findById(id);
//	}
	
//	public Employee getEmployeeByName(String name)
//	{
//		return employeeRepository.findByName(name);
//	}
	
	public String deletePersonne(long id)
	{
		personneRepository.deleteById(id);
		 return "suppression effectuée ";
	}
	
	public Personne updatePersonne(Personne e)
	{
		Personne ee = personneRepository.findById(e.getId_personne()).orElse(null);
		ee.setFirstName(e.getFirstName());
		ee.setLastName(e.getLastName());
		ee.setEmail(e.getEmail());
		
		return personneRepository.save(ee);
	}
	
}

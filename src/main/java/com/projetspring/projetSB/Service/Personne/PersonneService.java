package com.projetspring.projetSB.Service.Personne;

import java.util.List;

import com.projetspring.projetSB.Entity.Personne;


public interface PersonneService {
	
	List<Personne> getAllPersonnes();
	Personne addPersonne(Personne p);
    //Employee getEmployee(long id);
    //Employee getEmployeeByName(String name);
    String deletePersonne(long id);
    Personne updatePersonne(Personne p);

}

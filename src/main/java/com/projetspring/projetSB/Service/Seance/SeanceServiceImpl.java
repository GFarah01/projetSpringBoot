package com.projetspring.projetSB.Service.Seance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.projetspring.projetSB.Entity.Coach;
import com.projetspring.projetSB.Entity.Seance;
import com.projetspring.projetSB.Repository.SeanceRepository;

// à verifier les champs des cles etrangers !!!!!!!!

@Service
public class SeanceServiceImpl implements SeanceService {
	
	@Autowired
	private SeanceRepository repo;
	
	public List<Seance> getAllSeances() {
		
		return repo.findAll(); 
	}
	
	public Seance getSeance(long id)
	{
		return repo.findById(id).orElse(null);
	}
	
	public Seance addSeance(Seance e)
	{
		return repo.save(e);
	}
	
	public Seance updateSeance(Seance e)
	{
		Seance ee = repo.findById(e.getId()).orElse(null);
		ee.setLibelle(e.getLibelle());
		ee.setDuree(e.getDuree());
		ee.setTypeseance(e.getTypeseance());
	
		return repo.save(ee);
	}
	
	public ResponseEntity<Seance> deleteSeance(long id)
	{
		repo.deleteById(id);
		return new ResponseEntity<Seance>(HttpStatus.OK);
	}

}

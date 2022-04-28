package com.projetspring.projetSB.Service.Seance;

import java.util.List;
import org.springframework.http.ResponseEntity;

import com.projetspring.projetSB.Entity.Seance;

public interface SeanceService {

	List<Seance> getAllSeances();
	Seance addSeance(Seance p);
    Seance getSeance(long id);
    //Employee getEmployeeByName(String name);
    ResponseEntity<Seance> deleteSeance(long id);
    Seance updateSeance(Seance p);
}

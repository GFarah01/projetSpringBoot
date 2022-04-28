package com.projetspring.projetSB.Service.Coach;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.projetspring.projetSB.Entity.Coach;

public interface CoachService {
	
	List<Coach> getAllCoachs();
	Coach addCoach(Coach p);
    Coach getCoach(long id);
    //Employee getEmployeeByName(String name);
    ResponseEntity<Coach> deleteCoach(long id);
    Coach updateCoach(Coach p);

}

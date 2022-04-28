package com.projetspring.projetSB.Service.Participant;

import java.util.List;

import com.projetspring.projetSB.Entity.Participant;

public interface ParticipantService {

	List<Participant> getAllParticipants();
	Participant addParticipant(Participant p);
    //Employee getEmployee(long id);
    //Employee getEmployeeByName(String name);
    String deleteParticipant(long id);
    Participant updateParticipant(Participant p);

}


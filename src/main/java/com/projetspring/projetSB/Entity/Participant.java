package com.projetspring.projetSB.Entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
@Table(name = "participant")
public class Participant extends Personne implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String description_prob;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy="listeParticipants")
	private Set<Seance> seancesParticipant;
		
	public Participant() {}

	public String getDescription_prob() {
		return description_prob;
	}

	public void setDescription_prob(String description_prob) {
		this.description_prob = description_prob;
	}

	public Set<Seance> getSeancesParticipant() {
		return seancesParticipant;
	}

	public void setSeancesParticipant(Set<Seance> seancesParticipant) {
		this.seancesParticipant = seancesParticipant;
	}

	public Participant(String firstName, String lastName, String email, int age, String description_prob, Set<Seance> seancesParticipant) {
		super(firstName,lastName,email,age);
		this.description_prob = description_prob;
		this.seancesParticipant = seancesParticipant;
	};
	
	public Participant(String firstName, String lastName, String email, int age, String description_prob) {
		super(firstName,lastName,email,age);
		this.description_prob = description_prob;
	};
	
	
}

package com.projetspring.projetSB.Entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
//@DiscriminatorValue(value = "Coach")
@Table(name = "coach")
public class Coach extends Personne implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	public Coach(String firstName, String lastName, String email, int age,String specialite, Centre coachCentre, Set<Seance> seancesduCoach) {
		super(firstName,lastName,email,age);
		this.specialite = specialite;
		this.coachCentre = coachCentre;
		this.seancesduCoach = seancesduCoach;
	}
	
	public Coach(String firstName, String lastName, String email, int age,String specialite) {
		super(firstName,lastName,email,age);
		this.specialite = specialite;
	}


	@Column(name = "specialite")
	private String specialite;

	@OneToOne(mappedBy = "centreCoach")
    private Centre coachCentre;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "seanceducoach")
	private Set<Seance> seancesduCoach;

	
	public Coach() {};


	public String getSpecialite() {
		return specialite;
	}


	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}


	public Centre getCoachCentre() {
		return coachCentre;
	}

	public void setCoachCentre(Centre coachCentre) {
		this.coachCentre = coachCentre;
	}

	public Set<Seance> getSeancesduCoach() {
		return seancesduCoach;
	}


	public void setSeancesduCoach(Set<Seance> seancesduCoach) {
		this.seancesduCoach = seancesduCoach;
	};
	
}

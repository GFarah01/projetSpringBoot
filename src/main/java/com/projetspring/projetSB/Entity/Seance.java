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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@AllArgsConstructor
@Table(name = "seance")
public class Seance implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	
	private String libelle;
	
	private int duree ;
	
	private TypeSeance typeseance;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Participant> listeParticipants;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Coach seanceducoach;
	
	public Seance() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public TypeSeance getTypeseance() {
		return typeseance;
	}

	public void setTypeseance(TypeSeance typeseance) {
		this.typeseance = typeseance;
	}

	public Set<Participant> getListeParticipants() {
		return listeParticipants;
	}

	public void setListeParticipants(Set<Participant> listeParticipants) {
		this.listeParticipants = listeParticipants;
	}

	public Coach getSeanceducoach() {
		return seanceducoach;
	}

	public void setSeanceducoach(Coach seanceducoach) {
		this.seanceducoach = seanceducoach;
	}

	public Seance(long id, String libelle, int duree, TypeSeance typeseance, Set<Participant> listeParticipants,
			Coach seanceducoach) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.duree = duree;
		this.typeseance = typeseance;
		this.listeParticipants = listeParticipants;
		this.seanceducoach = seanceducoach;
	};
	
	
}

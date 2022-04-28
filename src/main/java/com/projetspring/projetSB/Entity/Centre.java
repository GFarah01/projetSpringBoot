package com.projetspring.projetSB.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "centre")
public class Centre {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id_centre;
	
	@Column(name = "libelle")
	private String libelle;
	
	@Column(name = "adresse")
	private String adresse;
	
	@OneToOne
	private Coach centreCoach;
	
	public Centre() {};
	
	

}

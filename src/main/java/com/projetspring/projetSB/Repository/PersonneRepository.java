package com.projetspring.projetSB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetspring.projetSB.Entity.*;


public interface PersonneRepository extends JpaRepository<Personne, Long> {

}

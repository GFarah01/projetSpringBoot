package com.projetspring.projetSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

//@ComponentScan(basePackageClasses = com.projetspring.projetSB.Service.Personne.PersonneService.class)
@ComponentScan("com.projetspring.projetSB")

public class ProjetSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetSbApplication.class, args);
	}

}

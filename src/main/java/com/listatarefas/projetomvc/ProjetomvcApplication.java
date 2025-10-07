package com.listatarefas.projetomvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetomvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetomvcApplication.class, args);
		System.out.println("Sistema iniciado com sucesso!");
		System.out.println("Acesse: http://localhost:8080");
	}

}

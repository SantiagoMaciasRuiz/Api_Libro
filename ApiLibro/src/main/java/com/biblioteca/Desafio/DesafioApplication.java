package com.biblioteca.Desafio;

import com.biblioteca.Desafio.Principal.principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}
	public void run(String... args) throws Exception {
		principal principal = new principal();
		principal.mostrarMenu();


	}
}

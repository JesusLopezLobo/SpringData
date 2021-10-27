package com.nttdata.desafio3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.desafio3.entity.Client;
import com.nttdata.desafio3.services.IClientService;

@SpringBootApplication
public class Desafio3Application implements CommandLineRunner{

	@Autowired
	private IClientService servicioCliente;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio3Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Client cliente = new Client();
		cliente.setName("Jesus");
		cliente.setFirstSurname("Lopez");
		cliente.setSecondSurname("Lobo");
		cliente.setDni("12345678T");
		
		servicioCliente.create(cliente);
		
		
		
	}

}

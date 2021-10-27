package com.nttdata.desafio3.services;

import java.util.List;

import com.nttdata.desafio3.entity.Client;

public interface IClientService {
	
	 	Client create(Client cliente);

	    Client update(Client cliente);

	    List<Client> findAll();

	    void delete(Long id);
}

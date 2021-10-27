package com.nttdata.desafio3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nttdata.desafio3.entity.Client;
import com.nttdata.desafio3.repository.IClienteRepository;

public class ClientServiceImpl implements IClientService{

	@Autowired
	private IClienteRepository clienteRepo;
	
	@Override
	public Client create(Client cliente) {
		
		return clienteRepo.save(cliente);
		
	}

	@Override
	public Client update(Client cliente) {
		
		return clienteRepo.save(cliente);
	}
	
	@Override
	public List<Client> findAll() {
		
		return clienteRepo.findAll();
	}

	@Override
	public void delete(Long id) {
		//clienteRepo.deleteById(id);
		
	}

}

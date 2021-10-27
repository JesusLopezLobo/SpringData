package com.nttdata.desafio3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.desafio3.entity.Client;

public interface IClienteRepository extends JpaRepository<Client, Long>{

}

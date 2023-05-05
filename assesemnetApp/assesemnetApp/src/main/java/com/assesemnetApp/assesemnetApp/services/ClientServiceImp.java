package com.assesemnetApp.assesemnetApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesemnetApp.assesemnetApp.entity.Client;
import com.assesemnetApp.assesemnetApp.repository.ClientRepository;

@Service
public class ClientServiceImp implements ClentService {

	@Autowired
	private ClientRepository clientRepo;
	@Override
	public Client saveclient(Client client) {
		// TODO Auto-generated method stub
		return clientRepo.save(client);
	}

}

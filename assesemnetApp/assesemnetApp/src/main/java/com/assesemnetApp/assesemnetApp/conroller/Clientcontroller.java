package com.assesemnetApp.assesemnetApp.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assesemnetApp.assesemnetApp.entity.ClientEntity;
import com.assesemnetApp.assesemnetApp.services.ClentService;

@RestController
public class Clientcontroller {
	
	@Autowired
	private ClentService clientSerive;
	
	@PostMapping("/clients")
	public ClientEntity saveClient(@RequestBody ClientEntity client) {
		
		return clientSerive.saveclient(client);
		
	}

}

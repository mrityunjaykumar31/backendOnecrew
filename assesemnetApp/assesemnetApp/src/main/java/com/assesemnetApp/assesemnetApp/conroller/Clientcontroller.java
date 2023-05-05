package com.assesemnetApp.assesemnetApp.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assesemnetApp.assesemnetApp.entity.Client;
import com.assesemnetApp.assesemnetApp.services.ClentService;

@RestController
public class Clientcontroller {
	
	@Autowired
	private ClentService clientSerive;
	
	@PostMapping("/clients")
	public Client saveClient(@RequestBody Client client) {
		
		return clientSerive.saveclient(client);
		
	}

}

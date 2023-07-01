package com.assesemnetApp.assesemnetApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.assesemnetApp.assesemnetApp.entity.ClientEntity;
import com.assesemnetApp.assesemnetApp.repository.ClientRepository;

import jakarta.mail.MessagingException;

@Service
public class ClientServiceImp implements ClentService {

	@Autowired
	private EmailService emailService;
	@Autowired
	private ClientRepository clientRepo;
	@Override
	public ClientEntity saveclient(ClientEntity client) {
		// TODO Auto-generated method stub
		
		try {
			this.emailService.sendClientCreationEmail(client);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clientRepo.save(client);
	}
	
	@Override
	public ClientEntity fetchByClientnameAndClientpassword(String clientname, String clientpassword) {
		// TODO Auto-generated method stub
		return clientRepo.findByClientnameAndClientpassword(clientname, clientpassword);
	}



	

}

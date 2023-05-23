package com.assesemnetApp.assesemnetApp.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assesemnetApp.assesemnetApp.services.EmailService;
import com.assesemnetApp.assesemnetApp.services.EncryptionService;


@RestController
public class Login {
	
	
	@Autowired
	EmailService emailService;
	@Autowired
	EncryptionService encryptionService;
	
	@GetMapping("/loginAuthCheck")
	public void home() {
		
		System.out.println("working");
	//	return "updated";
		
	 String url = "http://52.207.59.58/login"+this.encryptionService.encrypt("mk");
	//this.emailService.sendHtmlEmail("mrityunjaykumar31@gmail.com", "test", url);
	}

}

package com.assesemnetApp.assesemnetApp.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assesemnetApp.assesemnetApp.services.EmailService;
import com.assesemnetApp.assesemnetApp.services.EncryptionService;

import jakarta.mail.MessagingException;

import java.util.Date;

@RestController
public class EmailController {
	
	@Autowired
	EmailService emailService;
	@Autowired
	EncryptionService encryptionService;
	
	
	@GetMapping("/sendEmail")
	public void sendEmail() {
		
		String baseUrl = "http://52.207.59.58/login/"+ this.encryptionService.encrypt(new Date().toString());
		String title = "Exam Details";
		String mail= "mrityunjaykumar31@gmail.com";
		
		try {
			this.emailService.sendHtmlEmail("career4@prernagroup.org", title, baseUrl, mail);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

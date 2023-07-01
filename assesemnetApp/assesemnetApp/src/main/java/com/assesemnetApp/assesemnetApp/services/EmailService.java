package com.assesemnetApp.assesemnetApp.services;

import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.assesemnetApp.assesemnetApp.entity.ClientEntity;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;


@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender mailSender;
	
    @Autowired
    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }


	
	public void sendHtmlEmail(String mailId, String title, String url, String mail, String pwd, String name) throws MessagingException {
	    MimeMessage message = mailSender.createMimeMessage();

	    message.setFrom(new InternetAddress(mailId));
	    message.setRecipients(MimeMessage.RecipientType.TO, mail);
	    message.setSubject(title);

	    String htmlTemplate;
		//try {
			//htmlTemplate = readFile("email-template.html");
			// Replace placeholders in the HTML template with dynamic values
			htmlTemplate = " <h1>Welcome!</h1>"+ "<p>Thank you for joining us. We're excited to have you on board.</p>" + "<p>Your login url: <a href=\"" + url + "\">" + url + "</a></p>" +" <p>User: ${name}</p> " + "<p>Password: ${pwd} </p>";
		    htmlTemplate = htmlTemplate.replace("${url}",url);
		  htmlTemplate = htmlTemplate.replace("${pwd}", pwd);
		//  htmlTemplate = htmlTemplate.replace("${name}", name);
		    message.setContent(htmlTemplate, "text/html; charset=utf-8");
	//	}// catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}

	    

	    mailSender.send(message);
	}

	
	
	public void sendReportEamil(Long exmId, String mailId, Long Studentid) throws MessagingException {
		
	    MimeMessage message = mailSender.createMimeMessage();

	    message.setFrom(new InternetAddress("career4@prernagroup.org"));
	    message.setRecipients(MimeMessage.RecipientType.TO, mailId);
	    message.setSubject("Report Port");

	    String baseUrl = "http://localhost:8082/generate-pdf?value="+exmId + "&Id=" + Studentid;
	    String htmlTemplate;
		//try {
			//htmlTemplate = readFile("email-template.html");
			// Replace placeholders in the HTML template with dynamic values
			htmlTemplate = " <h1>Welcome!</h1>" + "<div>"+ "Download your report from: <a href=\"" + baseUrl + "\">\" + ${baseUrl} + \"</a>"
					+ "</div>";
			 htmlTemplate = htmlTemplate.replace("${baseUrl}", baseUrl);
		    message.setContent(htmlTemplate, "text/html; charset=utf-8");
	//	}// catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}

	    

	    mailSender.send(message);
	}
	
	public void sendClientCreationEmail(ClientEntity clientEntity) throws MessagingException {
		   MimeMessage message = mailSender.createMimeMessage();

		    message.setFrom(new InternetAddress("career4@prernagroup.org"));
		    message.setRecipients(MimeMessage.RecipientType.TO, clientEntity.getClientEmail());
		    message.setSubject("Youe are registered with our organisation");

		   String baseUrl = "http://52.207.59.58/login";
		    String htmlTemplate;
			//try {
				//htmlTemplate = readFile("email-template.html");
				// Replace placeholders in the HTML template with dynamic values
				htmlTemplate = " <h1>Welcome!</h1>" + "<p>Your detils</p>" +"<div>"+ "Login Url: <a href=\"" + baseUrl + "\">\" + ${baseUrl} + \"</a>"
						+ "</div>" + "<p>Client Id: ${id} </p>" + "<p>user Id: ${name}</p>"+ "<p>Password: ${pwd}</p>";
				 htmlTemplate = htmlTemplate.replace("${baseUrl}", baseUrl);
				 htmlTemplate = htmlTemplate.replace("${id}", clientEntity.getClientid().toString());
				 htmlTemplate = htmlTemplate.replace("${name}", clientEntity.getClientname());
				 htmlTemplate = htmlTemplate.replace("${pwd}", clientEntity.getClientpassword());
			    message.setContent(htmlTemplate, "text/html; charset=utf-8");
		//	}// catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//}

		    

		    mailSender.send(message);
	}
	
	
}

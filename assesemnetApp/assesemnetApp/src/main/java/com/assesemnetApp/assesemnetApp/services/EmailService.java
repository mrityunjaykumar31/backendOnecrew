package com.assesemnetApp.assesemnetApp.services;

import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

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

	private String readFile (String filePath) throws IOException {
        byte[] encodedBytes = Files.readAllBytes(Paths.get(filePath));
        return new String(encodedBytes);
    }
	
	/*
	 * @Autowired private JavaMailSender mailSender;
	 * 
	 * public void sendHtmlEmail() throws MessagingException {
	 * //mailSender.createMimeMessage() jakarta.mail.internet.MimeMessage message =
	 * mailSender.createMimeMessage();
	 * 
	 * // message.setFrom(); / message.setSubject("Test email from Spring");
	 * 
	 * String htmlContent = "<h1>This is a test Spring Boot email</h1>" +
	 * "<p>It can contain <strong>HTML</strong> content.</p>";
	 * message.setContent(htmlContent, "text/html; charset=utf-8");
	 * 
	 * mailSender.send(message); }
	 */
	/*
	 * private JavaMailSender mailSender;
	 * 
	 * 
	 * @Autowired public void EmailService(JavaMailSender mailSender) {
	 * this.mailSender = mailSender; }
	 * 
	 * 
	 * public void sendEmail(String to, String subject, String body) {
	 * 
	 * SimpleMailMessage message = new SimpleMailMessage(); message.setTo(to);
	 * message.setSubject(subject); message.setText(body); mailSender.send(message);
	 * 
	 * }
	 * 
	 * 
	 * public void sendEmails(String to, String subject, String name, String
	 * username) throws MessagingException, IOException { MimeMessage message =
	 * javaMailSender.createMimeMessage(); MimeMessageHelper helper = new
	 * MimeMessageHelper(message, true); helper.setTo(to);
	 * helper.setSubject(subject);
	 * 
	 * // Read the HTML template file ClassPathResource templateResource = new
	 * ClassPathResource("email-template.html"); String templateContent = new
	 * String(templateResource.getInputStream().readAllBytes(),
	 * StandardCharsets.UTF_8);
	 * 
	 * // Replace the placeholders with actual values templateContent =
	 * templateContent.replace("{name}", name); templateContent =
	 * templateContent.replace("{username}", username);
	 * 
	 * // Set the HTML template as the content of the email
	 * helper.setText(templateContent, true);
	 * 
	 * javaMailSender.send(message); }
	 * 
	 * 
	 * public void sendEmails(String to, String subject, String url) {
	 * 
	 * jakarta.mail.internet.MimeMessage mimeMessage =
	 * mailSender.createMimeMessage();
	 * 
	 * try { MimeMessageHelper mimeMessageHelper = new
	 * MimeMessageHelper(mimeMessage, true); mimeMessageHelper.setTo(to);
	 * mimeMessageHelper.setSubject(subject);
	 * mimeMessageHelper.setFrom("mrityunjayint@gmail.com");
	 * 
	 * // Read the HTML template file ClassPathResource templateResource = new
	 * ClassPathResource("email-template.html"); try { String templateContent = new
	 * String(templateResource.getInputStream().readAllBytes(),
	 * StandardCharsets.UTF_8);
	 * 
	 * //String templateContent = new
	 * String(templateResource.getInputStream().readAllBytes(),
	 * StandardCharsets.UTF_8);
	 * 
	 * // Replace the placeholders with actual values // templateContent =
	 * templateContent.replace("{name}", name); templateContent =
	 * templateContent.replace("{url}", url);
	 * 
	 * // Set the HTML template as the content of the email
	 * mimeMessageHelper.setText(templateContent, true);
	 * 
	 * mailSender.send(mimeMessage); } catch (IOException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * 
	 * } catch (jakarta.mail.MessagingException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); } }
	 */
}

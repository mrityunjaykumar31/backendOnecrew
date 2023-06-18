package com.assesemnetApp.assesemnetApp.conroller;
import org.apache.pdfbox.pdmodel.PDDocument;
import java.sql.Timestamp;
import java.util.Date;
import org.apache.pdfbox.pdmodel.PDPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.mail.MessagingException;

import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import java.io.InputStream;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletResponse;
import java.io.OutputStream;

import com.assesemnetApp.assesemnetApp.entity.StudentEntity;
import com.assesemnetApp.assesemnetApp.model.StudentDetails;
import com.assesemnetApp.assesemnetApp.services.PdfGeneratorService;
import com.assesemnetApp.assesemnetApp.services.StudentService;
import com.itextpdf.text.*;
//import com.itextpdf.text.pdf.PdfWriter;

@RestController
public class ReportController {
	
	 @Autowired
	 StudentService studentService;
	 
	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private PdfGeneratorService pdfGeneratorService;
 

        @GetMapping("/generate-pdf")
        public void generatePdf(HttpServletResponse response) {
        	
        	StudentEntity studentDetails = this.studentService.fetchBystudentId(Long.valueOf(1154));
            try {
            	
            	
				
            	 String title = "Sample Title";
                 String content = "Sample Content";
                 Object student = studentDetails;
                 java.sql.Timestamp timestamp = studentDetails.getExamStartTime();
                 Date date =  new java.util.Date(timestamp.getTime());

                 byte[] pdfBytes = pdfGeneratorService.generatePdf(title, content, student, date);

                 response.setContentType("application/pdf");
                 response.setHeader("Content-Disposition", "attachment; filename=\"generated.pdf\"");
                 response.getOutputStream().write(pdfBytes);
                 
                 
            } catch (Exception e) {
                e.printStackTrace();
            }
        
    }
	
    private void sendEmailWithAttachment(byte[] pdfBytes) throws AddressException, javax.mail.MessagingException {
   
    	  Properties properties = new Properties();
    	    properties.put("mail.smtp.host", "smtp.rediffmailpro.com");
    	    properties.put("mail.smtp.port", 587);

    	    Session session = Session.getInstance(properties, null);

    	    MimeMessage message = new MimeMessage(session);
			try {
				message.setFrom(new InternetAddress("career4@prernagroup.org"));
			} catch (AddressException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (javax.mail.MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("mrityunjaykumar31@gmail.com"));
			message.setSubject("PDF Report");

			// Create the attachment
			InputStream inputStream = new ByteArrayInputStream(pdfBytes);

			// Create the body part for the attachment
			BodyPart attachmentBodyPart = new MimeBodyPart();
			try {
				attachmentBodyPart.setDataHandler(new DataHandler(new ByteArrayDataSource(inputStream, "application/pdf")));
			} catch (javax.mail.MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			attachmentBodyPart.setFileName("report.pdf");

			// Create the multipart and add the attachment body part
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(attachmentBodyPart);

			// Set the multipart as the content of the message
			message.setContent(multipart);

			// Send the email
			try {
				Transport.send(message);
			} catch (javax.mail.MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
	
}

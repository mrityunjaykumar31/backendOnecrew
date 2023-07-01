package com.assesemnetApp.assesemnetApp.conroller;
import org.apache.pdfbox.pdmodel.PDDocument;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Optional;

import org.apache.pdfbox.pdmodel.PDPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
import com.assesemnetApp.assesemnetApp.model.GeneratereportRequestModel;
import com.assesemnetApp.assesemnetApp.model.StudentDetails;
import com.assesemnetApp.assesemnetApp.repository.KeyRepository;
import com.assesemnetApp.assesemnetApp.repository.ReportRepository;
import com.assesemnetApp.assesemnetApp.services.AnswerService;
import com.assesemnetApp.assesemnetApp.services.EmailService;
import com.assesemnetApp.assesemnetApp.services.EncryptionService;
import com.assesemnetApp.assesemnetApp.services.PdfGeneratorService;
import com.assesemnetApp.assesemnetApp.services.ReportService;
import com.assesemnetApp.assesemnetApp.services.StudentService;
import com.itextpdf.text.*;
//import com.itextpdf.text.pdf.PdfWriter;
import com.assesemnetApp.assesemnetApp.entity.AnswerEntity;
import com.assesemnetApp.assesemnetApp.entity.KeyEntity;
import com.assesemnetApp.assesemnetApp.entity.ReportEntity;

import java.text.SimpleDateFormat;
import java.util.List;


@RestController
public class ReportController {
	
	 @Autowired
	 StudentService studentService;
	 
	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private PdfGeneratorService pdfGeneratorService;
	@Autowired
	EncryptionService encryptionService;
 
	@Autowired
	AnswerService answerService;
	
	@Autowired
	EmailService emailService;
	
	@Autowired
	KeyRepository keyRepository;
	
	
	@Autowired
	ReportRepository reportRepository;
	
        @GetMapping("/generate-pdf")
        public void generatePdf(@RequestParam("value") String value,@RequestParam("Id") String Id, HttpServletResponse response)throws Exception {
        	
        	//KeyEntity kentity = this.keyRepository.getById(Id);
        	System.out.print(Id);
        //System.out.print(this.encryptionService.AESdecrypt(value, Id));
        	StudentEntity studentDetails = this.studentService.fetchBystudentId(Long.valueOf(Id));
            try {
            	
            	
				
            	String title = "Sample Title";
                 String content = "Sample Content";
                 Object student = studentDetails;
             //    java.sql.Timestamp timestamp = studentDetails.getExamStartTime();
            //     Date date =  new java.util.Date(timestamp.getTime());

                 byte[] pdfBytes = pdfGeneratorService.generatePdf(title, content, student);

                 response.setContentType("application/pdf");
                 response.setHeader("Content-Disposition", "attachment; filename=\"generated.pdf\"");
                 response.getOutputStream().write(pdfBytes);
                 
                 
            } catch (Exception e) {
                e.printStackTrace();
            }
        
    }

        
        @PostMapping("/generateReport")
        public void generateReport(@RequestBody GeneratereportRequestModel  generatereportRequestModel) throws Exception {
        	
        	List<ReportEntity> reportEntity =  this.reportRepository.findByExamId(generatereportRequestModel.getExamId());
        	
        	
        	for (ReportEntity reop: reportEntity) {
        		StudentEntity studentEntity = this.studentService.fetchBystudentId(reop.getStudentId());
        		this.emailService.sendReportEamil(generatereportRequestModel.getExamId(), studentEntity.getStudentEmail(), reop.getStudentId());
        		
        	}
        	
        //	this.emailService.sendReportEamil(encans, ans.getStudent().getStudentEmail(), key);
        	//  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            //  Date parsedDate = dateFormat.parse(generatereportRequestModel.getExamdate());
        	//Date date = new java.util.Date();
        	
      //  java.util.List<AnswerEntity> answers = this.answerService.findByDateAndClientId(parsedDate, generatereportRequestModel.getClientId());
        	
        	// this.answerService.findByDateAndClientId(java.util.Date(generatereportRequestModel.getExamdate()), generatereportRequestModel.getClientId());
     /** for(AnswerEntity ans : answers) {
        
      String  key = 	this.encryptionService.generateKey();
      String encans = this.encryptionService.AESencrypt(ans.toString(), key.trim());
        KeyEntity keyEntity = new KeyEntity();
        keyEntity.setEnkey(key.trim());
        this.keyRepository.save(keyEntity);	
        System.out.print(key);
        	this.emailService.sendReportEamil(encans, ans.getStudent().getStudentEmail(), key);
        }**/
       
        	
        	;
      //  System.out.println(answers);
        	 
        	 //return "X";
        }
	
}

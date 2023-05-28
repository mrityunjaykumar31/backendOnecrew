package com.assesemnetApp.assesemnetApp.services;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesemnetApp.assesemnetApp.entity.ClientEntity;
import com.assesemnetApp.assesemnetApp.entity.QuestionEntity;
import com.assesemnetApp.assesemnetApp.entity.StudentEntity;
import com.assesemnetApp.assesemnetApp.model.student;
import com.assesemnetApp.assesemnetApp.repository.ClientRepository;
import com.assesemnetApp.assesemnetApp.repository.StudentRepository;
import com.assesmentApp.assesmentApp.error.StudentException;

import jakarta.mail.MessagingException;

import org.apache.commons.lang3.RandomStringUtils;

@Service
public class StudentServiceImp implements StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	@Autowired
	private ClientRepository ClientRepo;
	@Autowired
	private EmailService emailService;
	@Autowired
	EncryptionService encryptionService;
	@Override
	public StudentEntity savestudent(StudentEntity student, Long clientId) {
		// TODO Auto-generated method stub
		
		ClientEntity client = null;
		
		client = ClientRepo.findById(clientId).orElseThrow(() -> new IllegalArgumentException("Invalid Client ID"));
		
		student.setClient(client);
		return studentRepo.save(student);
	}
	@Override
	public StudentEntity fetchByEnrollmentNameAndMobileNumber(String studentEnrollmentNo, Long studentMobileNumber) {
		// TODO Auto-generated method stub
		try {
			return studentRepo.findByStudentEnrollmentNoAndStudentMobileNumber(studentEnrollmentNo, studentMobileNumber);
		}catch(Exception e) {
			
			//StudentException = new StudentException()
			//return ;
			throw e;
		}
		
	}
	@Override
	public List<StudentEntity> saveStudents(List<student> students) {
		// TODO Auto-generated method stub
		List<StudentEntity> _students = new ArrayList<>();

		
		for (student st : students) {
			
			
			ClientEntity client = null;
			StudentEntity stu = new StudentEntity();
			client = ClientRepo.findById(st.getCientId()).orElseThrow(() -> new IllegalArgumentException("Invalid Client ID for" +st.getCientId()));
			
			 String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
		        String pwd =   RandomStringUtils.random(10, characters);
		        
			stu.setStudentEmail(st.getStudentEmail());
			stu.setStudentEnrollmentNo(st.getStudentEnrollmentNo());
			stu.setClient(client);
			stu.setPwd(pwd);
			
			try {
				
				String baseUrl = "http://52.207.59.58/login/"+ this.encryptionService.encrypt(st.getStudentEnrollmentNo());
				String title = "Exam Details";
				String mail= st.getStudentEmail();
				this.emailService.sendHtmlEmail("career4@prernagroup.org", title, baseUrl, mail, pwd, st.getStudentEnrollmentNo());
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			_students.add(stu);
			
		    } 
		return studentRepo.saveAll(_students);
	}

}

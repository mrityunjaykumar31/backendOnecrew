package com.assesemnetApp.assesemnetApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesemnetApp.assesemnetApp.entity.ClientEntity;
import com.assesemnetApp.assesemnetApp.entity.QuestionEntity;
import com.assesemnetApp.assesemnetApp.entity.StudentEntity;
import com.assesemnetApp.assesemnetApp.repository.ClientRepository;
import com.assesemnetApp.assesemnetApp.repository.StudentRepository;
import com.assesmentApp.assesmentApp.error.StudentException;

@Service
public class StudentServiceImp implements StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	@Autowired
	private ClientRepository ClientRepo;
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

}

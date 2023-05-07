package com.assesemnetApp.assesemnetApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.assesemnetApp.assesemnetApp.entity.StudentEntity;
import com.assesemnetApp.assesemnetApp.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	@Override
	public StudentEntity savestudent(StudentEntity student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}
	@Override
	public StudentEntity fetchByEnrollmentNameAndMobileNumber(String studentEnrollmentNo, Long studentMobileNumber) {
		// TODO Auto-generated method stub
		return studentRepo.findByStudentEnrollmentNoAndStudentMobileNumber(studentEnrollmentNo, studentMobileNumber);
	}
	
	
	
	
	

}

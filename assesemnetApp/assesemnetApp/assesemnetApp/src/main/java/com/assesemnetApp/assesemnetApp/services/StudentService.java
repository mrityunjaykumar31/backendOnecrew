package com.assesemnetApp.assesemnetApp.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.assesemnetApp.assesemnetApp.entity.StudentEntity;
import com.assesemnetApp.assesemnetApp.model.StudentDetails;
import com.assesemnetApp.assesemnetApp.model.student;


public interface StudentService {

	StudentEntity savestudent(StudentEntity student, Long clientId);

	StudentEntity fetchByEnrollmentNameAndMobileNumber(String studentEnrollmentNo, Long studentMobileNumber);

	List<StudentEntity> saveStudents(List<student> students);
	
	StudentEntity fetchByPwdAndMobileNumber(String Pwd, Long studentMobileNumber);
	
	StudentEntity fetchBystudentId(Long id);
	
	StudentEntity updateStudent(StudentEntity student);
	
	List<StudentEntity> getAllStudent(Long clientId);
	
	
}

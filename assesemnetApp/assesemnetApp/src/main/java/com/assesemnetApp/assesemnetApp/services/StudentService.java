package com.assesemnetApp.assesemnetApp.services;

import org.springframework.data.repository.query.Param;

import com.assesemnetApp.assesemnetApp.entity.StudentEntity;


public interface StudentService {

	StudentEntity savestudent(StudentEntity student);

	StudentEntity fetchByEnrollmentNameAndMobileNumber(String studentEnrollmentNo, Long studentMobileNumber);
	

}

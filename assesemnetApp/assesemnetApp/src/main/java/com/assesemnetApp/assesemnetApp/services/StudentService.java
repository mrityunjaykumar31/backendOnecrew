package com.assesemnetApp.assesemnetApp.services;

import com.assesemnetApp.assesemnetApp.entity.StudentEntity;


public interface StudentService {

	StudentEntity savestudent(StudentEntity student);

	StudentEntity fetchByEnrollmentNameAndMobileNumber(String studentEnrollmentNo, Long studentMobileNumber);

}

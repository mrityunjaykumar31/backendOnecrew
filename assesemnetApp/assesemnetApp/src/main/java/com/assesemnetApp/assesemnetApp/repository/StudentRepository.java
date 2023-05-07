package com.assesemnetApp.assesemnetApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assesemnetApp.assesemnetApp.entity.StudentEntity;

import io.micrometer.common.lang.Nullable;


@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long>{ 
	
	
	public StudentEntity findByStudentEnrollmentNoAndStudentMobileNumber(String studentEnrollmentNo, Long studentMobileNumber );

}

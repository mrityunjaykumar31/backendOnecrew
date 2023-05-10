package com.assesemnetApp.assesemnetApp.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.assesemnetApp.assesemnetApp.entity.StudentEntity;

import jakarta.transaction.Transactional;


@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long>{ 
	
	
	public StudentEntity findByStudentEnrollmentNoAndStudentMobileNumber(String studentEnrollmentNo, Long studentMobileNumber );
	
	
}

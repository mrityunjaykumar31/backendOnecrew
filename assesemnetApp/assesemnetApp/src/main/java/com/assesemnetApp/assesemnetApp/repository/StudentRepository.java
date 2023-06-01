package com.assesemnetApp.assesemnetApp.repository;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.assesemnetApp.assesemnetApp.entity.ClientEntity;
import com.assesemnetApp.assesemnetApp.entity.StudentEntity;

import ch.qos.logback.core.net.server.Client;
import jakarta.transaction.Transactional;


@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long>{ 
	
	
	public StudentEntity findByStudentEnrollmentNoAndStudentMobileNumber(String studentEnrollmentNo, Long studentMobileNumber );
	
	public StudentEntity findBystudentIdAndClient(Long studentId, ClientEntity client);

	public StudentEntity findByPwdAndStudentMobileNumber(String pwd, Long studentMobileNumber);
	public StudentEntity findByStudentId(Long id);
	

	
	
}

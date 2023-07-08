package com.assesemnetApp.assesemnetApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assesemnetApp.assesemnetApp.entity.AdminEntity;
import com.assesemnetApp.assesemnetApp.entity.AnswerEntity;
import com.assesemnetApp.assesemnetApp.entity.StudentEntity;

public interface AdminRepository extends JpaRepository<AdminEntity, Long>{

	
	public AdminEntity findByAdminUserAndAdminPass(String user, String pwd);
}

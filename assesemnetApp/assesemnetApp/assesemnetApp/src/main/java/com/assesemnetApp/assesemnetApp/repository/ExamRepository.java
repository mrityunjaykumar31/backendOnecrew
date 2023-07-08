package com.assesemnetApp.assesemnetApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assesemnetApp.assesemnetApp.entity.AdminEntity;
import com.assesemnetApp.assesemnetApp.entity.ExamEntity;

public interface ExamRepository extends JpaRepository<ExamEntity, Long>{
	
	List<ExamEntity> findByClient_Clientid(Long id); 

}

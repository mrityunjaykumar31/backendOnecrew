package com.assesemnetApp.assesemnetApp.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.assesemnetApp.assesemnetApp.entity.AnswerEntity;
import com.assesemnetApp.assesemnetApp.entity.QuestionEntity;
import com.assesemnetApp.assesemnetApp.entity.StudentEntity;


public interface AnswerRepository extends JpaRepository<AnswerEntity, Long>{
	
	
	
	@Query(value = "SELECT e FROM AnswerEntity e WHERE DATE(e.startTime) = :startTime AND e.client.clientid = :clientId")
	   public List<AnswerEntity> findBystartTimeAndClient_Clientid(Date startTime, Long clientId);


}

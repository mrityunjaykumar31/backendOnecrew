package com.assesemnetApp.assesemnetApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.assesemnetApp.assesemnetApp.entity.ClientEntity;
import com.assesemnetApp.assesemnetApp.entity.QuestionEntity;




@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity, Long>{ 
	
	//public List<QuestionEntity> findByQuestionStream(String questionStream);
//	public List<QuestionEntity> findByClient();
	
	
	public List<QuestionEntity> findByClient_Clientid(Long clientId);
	public List<QuestionEntity> findByQuestionStreamAndClient_Clientid(String questionStream, Long clientId);
	
	//Query( native = true,"SELECT s FROM QuestionEntity s WHERE s.questionStream = :questionStream AND s.clientId =:clientId")
	//List<QuestionEntity> getQuestionStreamAndClientId(@Param("questionStream")String questionStream, @Param("clientId") String clientId);
}

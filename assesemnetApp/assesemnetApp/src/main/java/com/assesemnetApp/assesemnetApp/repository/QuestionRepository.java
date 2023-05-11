package com.assesemnetApp.assesemnetApp.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.assesemnetApp.assesemnetApp.entity.QuestionEntity;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity, Long>{ 
	
	public List<QuestionEntity> findByQuestionStream(String questionStream);
	public List<QuestionEntity> findByClientId(String questionStream);
	
	
	public List<QuestionEntity> findByQuestionStreamAndClientId(String questionStream, String clientId );
	
	
	//@Query(native = true, value=""),
	
	// @Query("SELECT s FROM QuestionEntity s WHERE s.questionId = :clientId")
	// List<QuestionEntity> findByQuestionStreamAndClientId(@Param("questionStream")String questionStream, @Param("clientId") String clientId);
}

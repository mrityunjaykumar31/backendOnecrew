package com.assesemnetApp.assesemnetApp.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.assesemnetApp.assesemnetApp.entity.AnswerEntity;
import com.assesemnetApp.assesemnetApp.entity.GivenAnswerEntity;
import com.assesemnetApp.assesemnetApp.entity.QuestionEntity;
import com.assesemnetApp.assesemnetApp.entity.StudentEntity;
import com.assesemnetApp.assesemnetApp.model.answerJoinModel;


public interface AnswerRepository extends JpaRepository<AnswerEntity, Long>{
	
	
	
	@Query(value = "SELECT e FROM AnswerEntity e WHERE DATE(e.startTime) = :startTime AND e.client.clientid = :clientId")
	   public List<AnswerEntity> findBystartTimeAndClient_Clientid(Date startTime, Long clientId);

	//@Query("select u.userName from User u inner join u.area ar where ar.idArea = :idArea")
	 @Query(value = "select new com.assesemnetApp.assesemnetApp.model.AnswerJoinModel(ga.question_answer, ga.given_ansid, ga.question_id,  ea.answerid, ea.student_id, ea.start_time, ea.end_time, ea.clientid, ea.exam_id, qa.question_answer as originalAnswer) from given_answer_entity ga join answer_entity ea ON ga.answerid = ea.answerid join question_entity qa ON qa.question_id = ga.question_id where ea.exam_id = 1 and ea.clientid = 1 and ea.student_id = 1202", nativeQuery = true)
	 
	 public List<answerJoinModel> getx();
	 
	 	//	+ "join QuestionEntity qa ON qa.question_id = ga.question_id where ea.exam_id = 1 and ea.clientid = '1' and ea.student_id = 1202")
	//@Query(value = "select * from GivenAnswerEntity ga join AnswerEntity ea where ea.exam_id = :examId", nativeQuery = true) 
	//@Query(value = "select * from GivenAnswerEntity ga join AnswerEntity ea where ea.exam_id = :examId", nativeQuery = true) 
	 
	 public List<AnswerEntity> findByExamIdAndStudent_StudentId(Long examId, Long studentId);
	}

package com.assesemnetApp.assesemnetApp.services;

import java.util.Date;
import java.util.List;

import com.assesemnetApp.assesemnetApp.entity.AnswerEntity;
import com.assesemnetApp.assesemnetApp.entity.GivenAnswerEntity;
import com.assesemnetApp.assesemnetApp.model.Answer;
import com.assesemnetApp.assesemnetApp.model.AnswerResponseModel;
import com.assesemnetApp.assesemnetApp.model.answerJoinModel;

public interface AnswerService {

	AnswerEntity saveAnswer(AnswerResponseModel answerResponseModel);
	/*
	List<AnswerEntity> findByDateAndClientId(Date date, Long clientId);
	
	 * List<answerJoinModel> findByStudentExamAndClient(Long studentId, Long examId,
	 * Long clientId);
	 */
	List<AnswerEntity> getx();
	/* List<GivenAnswerEntity> getAnswaer(Long id); */
}

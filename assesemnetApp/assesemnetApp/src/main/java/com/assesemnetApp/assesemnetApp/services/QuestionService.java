package com.assesemnetApp.assesemnetApp.services;

import java.util.List;

import com.assesemnetApp.assesemnetApp.entity.QuestionEntity;
import com.assesemnetApp.assesemnetApp.model.Question;
import com.assesemnetApp.assesemnetApp.model.QuestionRequestModel;

public interface QuestionService {
	
	Question saveQuestion (Question Question, Long clientId);
	
	List<Question> findByQuestionStreamAndclientId(String questionStream, Long clientId);

	String saveQuestions(List<QuestionRequestModel> question);

}

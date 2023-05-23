package com.assesemnetApp.assesemnetApp.services;

import java.util.List;

import com.assesemnetApp.assesemnetApp.entity.QuestionEntity;
import com.assesemnetApp.assesemnetApp.model.Question;

public interface QuestionService {
	
	Question saveQuestion (Question Question, Long clientId);
	
	List<Question> findByQuestionStreamAndclient(String questionStream, Long clientId);

	List<Question> saveQuestions(List<Question> question);

}

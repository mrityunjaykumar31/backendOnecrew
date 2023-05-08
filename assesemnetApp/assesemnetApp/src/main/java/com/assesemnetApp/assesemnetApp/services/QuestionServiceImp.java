package com.assesemnetApp.assesemnetApp.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesemnetApp.assesemnetApp.entity.QuestionEntity;
import com.assesemnetApp.assesemnetApp.model.Option;
import com.assesemnetApp.assesemnetApp.model.Question;
import com.assesemnetApp.assesemnetApp.repository.QuestionRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class QuestionServiceImp implements QuestionService {
	
	@Autowired
	private QuestionRepository QuestionRepo;
	@Autowired
	 private ObjectMapper jacksonObjectMapper;
	
	@Override
	public Question saveQuestion(Question Q) {
		String jsonInString = null;
		List<Option> op = null;
		try {
			jsonInString = jacksonObjectMapper.writeValueAsString(Q.getQuestionOptions());
		} catch(Exception e) {
			
		}
		
		QuestionEntity _Question =  new QuestionEntity(Q.getQuestionId(), 
				Q.getQuestionName(), Q.getQuestionAnswer(),
				Q.getQuestionSet(), Q.getQuestionStream(), 
				Q.getClientId(), jsonInString );
				
		
		
		// TODO Auto-generated method stub
		QuestionEntity qe =   QuestionRepo.save(_Question);
		
		try {
				 
			op =  Arrays.asList(jacksonObjectMapper.readValue(qe.getQuestionOptions(), Option[].class));
		} catch( Exception e){}
		
		
		Question q =  new Question(qe.getQuestionId(), qe.getQuestionName(), qe.getQuestionAnswer(),
				qe.getQuestionSet(), qe.getQuestionStream(), qe.getClientId(), op);
		
		return q;
		
	}
	
	
	
	

}
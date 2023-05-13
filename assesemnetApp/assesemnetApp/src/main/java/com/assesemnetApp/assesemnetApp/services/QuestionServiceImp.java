package com.assesemnetApp.assesemnetApp.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesemnetApp.assesemnetApp.entity.ClientEntity;
import com.assesemnetApp.assesemnetApp.entity.QuestionEntity;
import com.assesemnetApp.assesemnetApp.model.Option;
import com.assesemnetApp.assesemnetApp.model.Question;
import com.assesemnetApp.assesemnetApp.repository.ClientRepository;
import com.assesemnetApp.assesemnetApp.repository.QuestionRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ch.qos.logback.core.net.server.Client;


@Service
public class QuestionServiceImp implements QuestionService {
	
	@Autowired
	private QuestionRepository QuestionRepo;
	@Autowired
	private ClientRepository ClientRepo;
	@Autowired
	 private ObjectMapper jacksonObjectMapper;
	
	@Override
	public Question saveQuestion(Question Q, Long clientId) {
		String jsonInString = null;
		List<Option> op = null;
		ClientEntity client = null;
		try {
			jsonInString = jacksonObjectMapper.writeValueAsString(Q.getQuestionOptions());
		} catch(Exception e) {
			
		}
		
		client = ClientRepo.findById(clientId).orElseThrow(() -> new IllegalArgumentException("Invalid Client ID"));
		 
		 
		QuestionEntity _Question =  new QuestionEntity(Q.getQuestionId(), 
				Q.getQuestionName(), Q.getQuestionAnswer(),
				Q.getQuestionSet(), Q.getQuestionStream(), 
				jsonInString, client );
				
	//	QuestionEntity _Question = new QuestionEntity()
		
		// TODO Auto-generated method stub
		QuestionEntity qe =   QuestionRepo.save(_Question);
		
		return this.convertEntityToModel(qe);
		
	}

	@Override
	public List<Question> findByQuestionStreamAndclient(String questionStream, Long clientId) {
		// TODO Auto-generated method stub
		
		ClientEntity client = null;
	//	List<QuestionEntity> all = QuestionRepo.findAll();
	//	System.out.println(questionStream + "  "+clientId+ ""+all );
		client = ClientRepo.findById(clientId).orElseThrow(() -> new IllegalArgumentException("Invalid Client ID"));
		List<QuestionEntity> qe = QuestionRepo.findByQuestionStreamAndClient(questionStream, client);
	//	 System.out.println(qe.toString());
	List<Question> q = qe.stream().map(en -> this.convertEntityToModel(en)).collect(Collectors.toList());
	return q;
	//	return null;
		 
	}
	
	public Question convertEntityToModel(QuestionEntity qe) {
		List<Option> op = null;
		try {
			 
			op =  Arrays.asList(jacksonObjectMapper.readValue(qe.getQuestionOptions(), Option[].class));
		} catch( Exception e){}
		
		
		Question q =  new Question(qe.getQuestionId(), qe.getQuestionName(), qe.getQuestionAnswer(),
				qe.getQuestionSet(), qe.getQuestionStream(), qe.getClient(), op);
		
		return q;
		//return null;
	}

	

}
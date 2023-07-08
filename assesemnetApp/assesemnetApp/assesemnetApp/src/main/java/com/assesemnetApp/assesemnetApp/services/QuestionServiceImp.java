package com.assesemnetApp.assesemnetApp.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesemnetApp.assesemnetApp.entity.ClientEntity;
import com.assesemnetApp.assesemnetApp.entity.QuestionEntity;
import com.assesemnetApp.assesemnetApp.entity.StudentEntity;
import com.assesemnetApp.assesemnetApp.model.Option;
import com.assesemnetApp.assesemnetApp.model.Question;
import com.assesemnetApp.assesemnetApp.model.QuestionRequestModel;
import com.assesemnetApp.assesemnetApp.model.student;
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
	public List<Question> findByQuestionStreamAndclientId(String questionStream, Long clientId, int limit ) {
		// TODO Auto-generated method stub
		
		ClientEntity client = null;
	//	List<QuestionEntity> all = QuestionRepo.findAll();
	//	System.out.println(questionStream + "  "+clientId+ ""+all );
		client = ClientRepo.findById(clientId).orElseThrow(() -> new IllegalArgumentException("Invalid Client ID"));
		//System.out.println(questionStream + "from controller" + client);
		List<QuestionEntity> qe = QuestionRepo.findRandomRecordsByQuestionStreamAndClient_Clientid(questionStream, clientId, limit);
	  
	List<Question> q = qe.stream().map(en -> this.convertEntityToModel(en)).collect(Collectors.toList());
		//List<Question> q = [];
	
	//System.out.println("", q);
	return q;
		//return [];
		 
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

	@Override
	public String saveQuestions(List<QuestionRequestModel> question) {
		// TODO Auto-generated method stub
		
		List<QuestionEntity> qe = new ArrayList<>();

		
		for (QuestionRequestModel q : question) {
			
			
			String jsonInString = null;
			List<Option> op = null;
			ClientEntity client = null;
			try {
				jsonInString = jacksonObjectMapper.writeValueAsString(q.getQuestionOptions());
			} catch(Exception e) {
				
			}
			
			client = ClientRepo.findById(q.getClientId()).orElseThrow(() -> new IllegalArgumentException("Invalid Client ID"));
			 
			 
			QuestionEntity _Question =  new QuestionEntity();
		
			_Question.setQuestionName(q.getQuestionName());
			_Question.setQuestionAnswer(q.getQuestionAnswer());
			_Question.setQuestionSet(q.getQuestionSet());
			_Question.setQuestionStream(q.getQuestionStream());
			_Question.setQuestionOptions(jsonInString);
			_Question.setClient(client);
			
			qe.add(_Question);
		}
		QuestionRepo.saveAll(qe);
		
		return "Question Saved";
	};

	

}
package com.assesemnetApp.assesemnetApp.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesemnetApp.assesemnetApp.entity.AnswerEntity;
import com.assesemnetApp.assesemnetApp.entity.ClientEntity;
import com.assesemnetApp.assesemnetApp.entity.GivenAnswerEntity;
import com.assesemnetApp.assesemnetApp.entity.StudentEntity;
import com.assesemnetApp.assesemnetApp.model.Answer;
import com.assesemnetApp.assesemnetApp.model.AnswerResponseModel;
import com.assesemnetApp.assesemnetApp.repository.AnswerRepository;
import com.assesemnetApp.assesemnetApp.repository.ClientRepository;
import com.assesemnetApp.assesemnetApp.repository.StudentRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AnswerServiceImp implements AnswerService  {
	
	@Autowired
	private ClientRepository ClientRepo;
	@Autowired
	private StudentRepository StudentRepo;
	@Autowired
	private AnswerRepository AnsRepo;
	
	@Autowired
	 private ObjectMapper jacksonObjectMapper;
	@Autowired
	private UtilsService utilsService;

	@Override
	public AnswerEntity saveAnswer(AnswerResponseModel answerResponseModel) {
		// TODO Auto-generated method stub
		ClientEntity client = null;
		StudentEntity student = null;
		String jsonInString = null;
		GivenAnswerEntity givenAnswerEntity = new GivenAnswerEntity();
		client = ClientRepo.findById(answerResponseModel.getClientid()).orElseThrow(() -> new IllegalArgumentException("Invalid Client ID"));
		//student = StudentRepo.findBystudentIdAndClient(studentId, client).orElseThrow(() -> new IllegalArgumentException("Invalid Client ID"));
		student = StudentRepo.findBystudentIdAndClient(answerResponseModel.getStudentId(), client);
		try {
			jsonInString = jacksonObjectMapper.writeValueAsString(answerResponseModel.getAnswer());
		} catch(Exception e) {
			
		}
		AnswerEntity ans = new AnswerEntity();
		List<GivenAnswerEntity> givenAnswerList = new ArrayList<>();

		// Create and populate GivenAnswerEntity instances dynamically
		for (Answer _answer: answerResponseModel.getAnswer()) {
		    GivenAnswerEntity givenAnswer = new GivenAnswerEntity();
		    // Set attributes of givenAnswer dynamically
		    
		    // Set the AnswerEntity as the parent entity for the GivenAnswerEntity instance
		    givenAnswer.setAnswerEntity(ans);
		    givenAnswer.setQuestionId(_answer.getQuestionId());
		    givenAnswer.setQuestionAnswer(_answer.getQuestionAnswer());
		    // Add the GivenAnswerEntity instance to the list
		    givenAnswerList.add(givenAnswer);
		}

		// Set the list of GivenAnswerEntity instances to the AnswerEntity
		ans.setGivenAnswerEntity(givenAnswerList);

		// Save the AnswerEntity along with its associated GivenAnswerEntity instances
		
		
		
		
		//ans.setAnswer(answerResponseModel.getAnswer());
		ans.setStudent(student);
		ans.setEndTime(Timestamp.valueOf(answerResponseModel.getEndTime()));
		ans.setStartTime(Timestamp.valueOf(answerResponseModel.getStartTime()));
		//ans.setTimeStamp(null);
		ans.setClient(client);
		
	//	ans.setGivenAnswerEntity(answerResponseModel.getAnswer());
		return AnsRepo.save(ans);
	}

	@Override
	public List<AnswerEntity> findByDateAndClientId(Date date, Long clientId) {
		// TODO Auto-generated method stub
		return this.AnsRepo.findBystartTimeAndClient_Clientid(date, clientId);
	}

}

package com.assesemnetApp.assesemnetApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesemnetApp.assesemnetApp.entity.AnswerEntity;
import com.assesemnetApp.assesemnetApp.entity.ClientEntity;
import com.assesemnetApp.assesemnetApp.entity.StudentEntity;
import com.assesemnetApp.assesemnetApp.model.Answer;
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

	@Override
	public AnswerEntity saveAnswer(List<Answer> answer, Long clientId, Long studentId) {
		// TODO Auto-generated method stub
		ClientEntity client = null;
		StudentEntity student = null;
		String jsonInString = null;
		client = ClientRepo.findById(clientId).orElseThrow(() -> new IllegalArgumentException("Invalid Client ID"));
		//student = StudentRepo.findBystudentIdAndClient(studentId, client).orElseThrow(() -> new IllegalArgumentException("Invalid Client ID"));
		student = StudentRepo.findBystudentIdAndClient(studentId, client);
		try {
			jsonInString = jacksonObjectMapper.writeValueAsString(answer);
		} catch(Exception e) {
			
		}
		AnswerEntity ans = new AnswerEntity();
		ans.setAnswer(jsonInString);
		ans.setStudent(student);
		ans.setTimeStamp(null);
	//	ans.
		return AnsRepo.save(ans);
	}

}

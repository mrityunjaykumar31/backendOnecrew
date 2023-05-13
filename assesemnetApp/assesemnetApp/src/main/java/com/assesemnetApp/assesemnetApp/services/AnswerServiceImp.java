package com.assesemnetApp.assesemnetApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesemnetApp.assesemnetApp.entity.AnswerEntity;
import com.assesemnetApp.assesemnetApp.entity.ClientEntity;
import com.assesemnetApp.assesemnetApp.entity.StudentEntity;
import com.assesemnetApp.assesemnetApp.model.Answer;
import com.assesemnetApp.assesemnetApp.repository.AnswerRepository;
import com.assesemnetApp.assesemnetApp.repository.ClientRepository;
import com.assesemnetApp.assesemnetApp.repository.StudentRepository;

@Service
public class AnswerServiceImp implements AnswerService  {
	
	@Autowired
	private ClientRepository ClientRepo;
	@Autowired
	private StudentRepository StudentRepo;
	@Autowired
	private AnswerRepository AnsRepo;

	@Override
	public AnswerEntity saveAnswer(Answer answer, Long clientId, Long studentId) {
		// TODO Auto-generated method stub
		ClientEntity client = null;
		StudentEntity student = null;
		client = ClientRepo.findById(clientId).orElseThrow(() -> new IllegalArgumentException("Invalid Client ID"));
		//student = StudentRepo.findBystudentIdAndClient(studentId, client).orElseThrow(() -> new IllegalArgumentException("Invalid Client ID"));
		student = StudentRepo.findBystudentIdAndClient(studentId, client);
		AnswerEntity _ans = new AnswerEntity(student, answer);
		return AnsRepo.save(_ans);
	}

}

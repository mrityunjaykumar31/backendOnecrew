package com.assesemnetApp.assesemnetApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesemnetApp.assesemnetApp.entity.QuestionEntity;
import com.assesemnetApp.assesemnetApp.repository.QuestionRepository;


@Service
public class QuestionServiceImp implements QuestionService {
	
	@Autowired
	private QuestionRepository QuestionRepo;
	@Override
	public QuestionEntity saveQuestion(QuestionEntity Question) {
		// TODO Auto-generated method stub
		return QuestionRepo.save(Question);
	}
	
	
	
	

}
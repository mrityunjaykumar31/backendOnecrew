package com.assesemnetApp.assesemnetApp.conroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assesemnetApp.assesemnetApp.entity.QuestionEntity;
import com.assesemnetApp.assesemnetApp.services.QuestionService;



@RestController
public class QuestionController {

	@Autowired 
	QuestionService QuestionService;
	
	
	@PostMapping("/Question")
	public QuestionEntity savestudent(@RequestBody QuestionEntity Question) {
		
		return QuestionService.saveQuestion(Question);
		
	}
}



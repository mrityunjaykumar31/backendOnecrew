package com.assesemnetApp.assesemnetApp.conroller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assesemnetApp.assesemnetApp.entity.QuestionEntity;
import com.assesemnetApp.assesemnetApp.model.Question;
import com.assesemnetApp.assesemnetApp.services.QuestionService;



@RestController
public class QuestionController {

	@Autowired 
	QuestionService QuestionService;
	
	
	@PostMapping("/Question")
	public Question savestudent(@RequestBody Question Question) {
		
		return QuestionService.saveQuestion(Question);
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/questions")
public ResponseEntity<List<Question>> getQuestion(@RequestParam(required=false, name = "questionStream") String questionStream, @RequestParam(required=false, name ="clientId") String clientId) {
		
		//return QuestionService.saveQuestion(Question);
		
		System.out.println(questionStream + "from controller" + clientId);
		
		List<Question> qe = QuestionService.findByQuestionStreamAndClientId(questionStream, clientId);
	
		
		if(qe == null) {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}else {
			return ResponseEntity.status(HttpStatus.OK).body(qe);
		}
		
	} 
	
}



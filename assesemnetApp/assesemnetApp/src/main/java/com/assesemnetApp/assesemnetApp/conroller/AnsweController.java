package com.assesemnetApp.assesemnetApp.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assesemnetApp.assesemnetApp.entity.AnswerEntity;
import com.assesemnetApp.assesemnetApp.model.Answer;
import com.assesemnetApp.assesemnetApp.services.AnswerService;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class AnsweController {
	
	@Autowired
	private AnswerService answerService;
	
	@CrossOrigin(origins = "*")
	@PostMapping("/submit")
	public ResponseEntity<String> submitAnswer(@RequestBody Answer answer, @RequestParam(required=false, name ="clientId") Long clientId, @RequestParam(required=false, name ="studentId") Long studentId) {
		
		AnswerEntity _answer	= answerService.saveAnswer(answer, clientId, studentId);
		
		if(_answer == null) {
			
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Some error occured");
		} else {
			 return ResponseEntity.ok("Submitted successfully");
		}
		
		
		
	}

}

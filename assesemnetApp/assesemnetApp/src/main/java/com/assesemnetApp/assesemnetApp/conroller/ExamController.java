package com.assesemnetApp.assesemnetApp.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assesemnetApp.assesemnetApp.entity.ExamEntity;
import com.assesemnetApp.assesemnetApp.entity.StudentEntity;
import com.assesemnetApp.assesemnetApp.model.ExamRequestModel;
import com.assesemnetApp.assesemnetApp.services.ExamService;

@RestController
public class ExamController {
	
	@Autowired
	ExamService examService;
	@PostMapping("/create-exam")
	public ResponseEntity<String> createExam(@RequestBody ExamRequestModel exam){
		
		this.examService.createExam(exam);
		
		return ResponseEntity.ok("Save successfully");
		//retrun ResponseEntity.st
	}

}

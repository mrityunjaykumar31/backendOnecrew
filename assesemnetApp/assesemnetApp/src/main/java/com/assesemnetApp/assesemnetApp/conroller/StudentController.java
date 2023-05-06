package com.assesemnetApp.assesemnetApp.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assesemnetApp.assesemnetApp.entity.StudentEntity;
import com.assesemnetApp.assesemnetApp.services.StudentService;




@RestController
public class StudentController {

	@Autowired 
	StudentService studentService;
	
	
	@PostMapping("/students")
	public StudentEntity saveClient(@RequestBody StudentEntity student) {
		
		return studentService.savestudent(student);
		
	}
}

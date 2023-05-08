package com.assesemnetApp.assesemnetApp.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/student-loging")
	
	public StudentEntity fetchByEnrollmentNameAndMobileNumber(@RequestParam("studentEnrollmentNo") String studentEnrollmentNo, @RequestParam("studentMobileNumber") Long studentMobileNumber ){
		
	//	StudentEntity student = studentService.fetchByEnrollmentNameAndMobileNumber(studentEnrollmentNo, studentMobileNumber);
		
	//	if(student.isPresent())
		
				

		return studentService.fetchByEnrollmentNameAndMobileNumber(studentEnrollmentNo, studentMobileNumber);
	}
	
}

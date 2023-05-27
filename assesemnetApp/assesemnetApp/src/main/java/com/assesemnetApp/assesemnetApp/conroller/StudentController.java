package com.assesemnetApp.assesemnetApp.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.assesemnetApp.assesemnetApp.entity.StudentEntity;
import com.assesemnetApp.assesemnetApp.model.StudentResponseModel;
import com.assesemnetApp.assesemnetApp.model.student;
import com.assesemnetApp.assesemnetApp.services.StudentService;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.core.JsonProcessingException;


@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class StudentController {

	@Autowired 
	StudentService studentService;
	@Autowired
	 private ObjectMapper jacksonObjectMapper;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/students")
	
	public StudentEntity saveClient(@RequestBody StudentEntity student, Long clientId) {
		
		
		return studentService.savestudent(student, clientId);
		
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@CrossOrigin(origins = "*")
	@GetMapping("/student-loging")
	public ResponseEntity<String> fetchByEnrollmentNameAndMobileNumber(@RequestParam("studentEnrollmentNo") String studentEnrollmentNo, @RequestParam("studentMobileNumber") String studentMobileNumber ){
		
		String jsonInString = null;
			
		
		Long _studentMobileNumber  = null;
		try {
			_studentMobileNumber =  (long) Integer.parseInt(studentMobileNumber);
			}catch(NumberFormatException nf) {
				StudentResponseModel res = new StudentResponseModel();
				
					res.setMessage("User not found");
					res.setSuccess(false);
					res.setStudentDetails(null);
					
					try {
						jsonInString = jacksonObjectMapper.writeValueAsString(res);
					}catch(Exception e){}
					
					return ResponseEntity.ok(jsonInString);
		}
		
		
		StudentEntity student = studentService.fetchByEnrollmentNameAndMobileNumber(studentEnrollmentNo, _studentMobileNumber);
		StudentResponseModel res = new StudentResponseModel();
		if(student == null) {
			res.setMessage("User not found");
			res.setSuccess(false);
			res.setStudentDetails(null);
			try {
				jsonInString = jacksonObjectMapper.writeValueAsString(res);
			}catch(Exception e){}
			
			return ResponseEntity.ok(jsonInString);
			
		}else {
			res.setMessage(null);
			res.setSuccess(true);
			res.setStudentDetails(student);
			try {
				jsonInString = jacksonObjectMapper.writeValueAsString(res);
			}catch(Exception e){}
			 return ResponseEntity.ok(jsonInString);
		}
		
	}
	
	
	@CrossOrigin(origins = "*")
	@PutMapping("/student")
	ResponseEntity<String> updateStudent(@RequestParam("studentEnrollmentNo") String studentEnrollmentNo,
			@RequestParam("studentMobileNumber") Long studentMobileNumber,
			@RequestParam("clientId") Long clientId,
			@RequestBody StudentEntity student)   {
		
		 StudentEntity existingStudent = studentService.fetchByEnrollmentNameAndMobileNumber(studentEnrollmentNo, studentMobileNumber);
		
		if (existingStudent == null) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");
	} {
		
		existingStudent.setStudentEmail(student.getStudentEmail());
		existingStudent.setStudentaddress(student.getStudentaddress());
		existingStudent.setStudentFatherName(student.getStudentFirstname());
		existingStudent.setStudentLastname(student.getStudentLastname());
		
		existingStudent.setStudentFirstname(student.getStudentFirstname());
		
		   studentService.savestudent(student, clientId);

		    return ResponseEntity.ok("Student updated successfully");
	} }
	
	
	
	@CrossOrigin(origins = "*")
	@PostMapping("/student")
	List<StudentEntity>saveStudents(@RequestBody List<student> students) {
			
		return studentService.saveStudents(students);
		
	}
	
	@PostMapping("/check-time")
	boolean checkTime(@RequestParam String token) {
		
		
		return true;
	}
}
	

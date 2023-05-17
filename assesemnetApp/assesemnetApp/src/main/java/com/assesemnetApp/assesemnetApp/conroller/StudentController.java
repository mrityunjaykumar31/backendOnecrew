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




@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class StudentController {

	@Autowired 
	StudentService studentService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/students")
	
	public StudentEntity saveClient(@RequestBody StudentEntity student, Long clientId) {
		
		
		return studentService.savestudent(student, clientId);
		
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@CrossOrigin(origins = "*")
	@GetMapping("/student-loging")
	public ResponseEntity<StudentResponseModel> fetchByEnrollmentNameAndMobileNumber(@RequestParam("studentEnrollmentNo") String studentEnrollmentNo, @RequestParam("studentMobileNumber") Long studentMobileNumber ){
		
		StudentEntity student = studentService.fetchByEnrollmentNameAndMobileNumber(studentEnrollmentNo, studentMobileNumber);
		StudentResponseModel res = new StudentResponseModel();
		if(student == null) {
			res.setMessage("User not found");
			res.setSuccess(false);
			res.setStudentDetails(null);
			return ResponseEntity.ok(res);
			
		}else {
			res.setMessage(null);
			res.setSuccess(true);
			res.setStudentDetails(student);
			 return ResponseEntity.ok(res);
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
}
	

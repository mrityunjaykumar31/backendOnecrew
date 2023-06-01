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
import com.assesemnetApp.assesemnetApp.model.StudentDetails;
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
	public ResponseEntity<String> fetchByPwdAndMobileNumber(@RequestParam("pwd") String pwd, @RequestParam("studentMobileNumber") Long studentMobileNumber ){
		
		String jsonInString = null;
			
		
		Long _studentMobileNumber  = null;
		try {
			//_studentMobileNumber =  (long) Integer.parseInt(studentMobileNumber);
			_studentMobileNumber = studentMobileNumber;
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
		
		
		
		StudentEntity student = studentService.fetchByPwdAndMobileNumber(pwd, _studentMobileNumber);
		StudentDetails studentDetils = new StudentDetails();
		
		
		
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

			studentDetils.setStudentId(student.getStudentId());
			studentDetils.setCientId(student.getClient().getClientid());
			studentDetils.setAadharNumber(student.getAadharNumber());
			studentDetils.setAttendentPsychometricTestBefore(student.isAttendentPsychometricTestBefore());
			studentDetils.setEmrno(student.getEmrno());
			studentDetils.setExamEndTime(student.getExamEndTime());
			studentDetils.setExamStartTime(student.getExamStartTime());
			studentDetils.setExamTime(student.getExamTime());
			studentDetils.setHighestQual(student.getHighestQual());
			studentDetils.setInstitutionName(student.getInstitutionName());
			studentDetils.setOrgName(student.getOrgName());
			studentDetils.setPanNo(student.getPanNo());
			studentDetils.setState(student.getState());
			studentDetils.setStudentaddress(student.getStudentaddress());
			studentDetils.setStudentBranch(student.getStudentBranch());
			studentDetils.setStudentDob(student.getStudentDob());
			studentDetils.setStudentEmail(student.getStudentEmail());
			studentDetils.setStudentEnrollmentNo(student.getStudentEnrollmentNo());
			studentDetils.setStudentFirstname(student.getStudentFirstname());
			studentDetils.setStudentLastname(student.getStudentLastname());
			studentDetils.setStudentMarks(student.getStudentMarks());
			studentDetils.setStudentMobileNumber(student.getStudentMobileNumber());
			studentDetils.setYearOfPassing(student.getYearOfPassing());
			studentDetils.setStudentFatherName(student.getStudentFatherName());
			res.setMessage(null);
			res.setSuccess(true);
			res.setStudentDetails(studentDetils);
			try {
				jsonInString = jacksonObjectMapper.writeValueAsString(res);
			}catch(Exception e){}
			 return ResponseEntity.ok(jsonInString);
		}
		
	}
	
	
	@CrossOrigin(origins = "*")
	@PutMapping("/student")
	ResponseEntity<String> updateStudent(@RequestBody StudentDetails student)   {
		
		// StudentEntity existingStudent = studentService.fetchByEnrollmentNameAndMobileNumber(studentEnrollmentNo, studentMobileNumber);
		StudentEntity existingStudent = studentService.fetchBystudentId(student.getStudentId());
		if (existingStudent == null) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");
	} {
		
		existingStudent.setAadharNumber(student.getAadharNumber());
		existingStudent.setisAttendentPsychometricTestBefore((student.isAttendentPsychometricTestBefore()));
		existingStudent.setEmrno(student.getEmrno());
		existingStudent.setExamEndTime(student.getExamEndTime());
		existingStudent.setExamStartTime(student.getExamStartTime());
		existingStudent.setExamTime(student.getExamTime());
		existingStudent.setHighestQual(student.getHighestQual());
		existingStudent.setInstitutionName(student.getInstitutionName());
		existingStudent.setOrgName(student.getOrgName());
		existingStudent.setPanNo(student.getPanNo());
		existingStudent.setState(student.getState());
		existingStudent.setStudentaddress(student.getStudentaddress());
		existingStudent.setStudentBranch(student.getStudentBranch());
		existingStudent.setStudentDob(student.getStudentDob());
		existingStudent.setStudentEmail(student.getStudentEmail());
		existingStudent.setStudentEnrollmentNo(student.getStudentEnrollmentNo());
		existingStudent.setStudentFirstname(student.getStudentFirstname());
		existingStudent.setStudentLastname(student.getStudentLastname());
		existingStudent.setStudentMarks(student.getStudentMarks());
		existingStudent.setStudentMobileNumber(student.getStudentMobileNumber());
		existingStudent.setYearOfPassing(student.getYearOfPassing());
		existingStudent.setStudentFatherName(student.getStudentFatherName());
		   studentService.updateStudent(existingStudent);

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
	

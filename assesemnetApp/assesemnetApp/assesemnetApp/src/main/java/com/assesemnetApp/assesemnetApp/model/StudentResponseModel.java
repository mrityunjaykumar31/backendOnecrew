package com.assesemnetApp.assesemnetApp.model;

import com.assesemnetApp.assesemnetApp.entity.StudentEntity;

public class StudentResponseModel {
	
	public StudentResponseModel(String message, boolean isSuccess, StudentDetails studentDetails) {
		super();
		this.message = message;
		this.isSuccess = isSuccess;
		this.studentDetails = studentDetails;
	}
	private String message;
	
	private boolean isSuccess;
	private StudentDetails studentDetails;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public StudentDetails getStudentDetails() {
		return studentDetails;
	}
	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}

	public StudentResponseModel(){};
	
	@Override
	public String toString() {
		return "StudentResponseModel [message=" + message + ", isSuccess=" + isSuccess + ", studentDetails="
				+ studentDetails + "]";
	}
}

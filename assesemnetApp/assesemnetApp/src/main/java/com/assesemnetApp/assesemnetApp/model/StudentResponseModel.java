package com.assesemnetApp.assesemnetApp.model;

import com.assesemnetApp.assesemnetApp.entity.StudentEntity;

public class StudentResponseModel {
	
	public StudentResponseModel(String message, boolean isSuccess, StudentEntity studentDetails) {
		super();
		this.message = message;
		this.isSuccess = isSuccess;
		this.studentDetails = studentDetails;
	}
	private String message;
	
	private boolean isSuccess;
	private StudentEntity studentDetails;
	
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
	public StudentEntity getStudentDetails() {
		return studentDetails;
	}
	public void setStudentDetails(StudentEntity studentDetails) {
		this.studentDetails = studentDetails;
	}

	public StudentResponseModel(){};
	
	@Override
	public String toString() {
		return "StudentResponseModel [message=" + message + ", isSuccess=" + isSuccess + ", studentDetails="
				+ studentDetails + "]";
	}
}

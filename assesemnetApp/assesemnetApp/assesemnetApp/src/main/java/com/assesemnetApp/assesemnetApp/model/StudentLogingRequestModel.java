package com.assesemnetApp.assesemnetApp.model;

public class StudentLogingRequestModel {
	
	String pwd;
	Long studentMobileNumber;
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Long getStudentMobileNumber() {
		return studentMobileNumber;
	}
	public void setStudentMobileNumber(Long studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}
	public StudentLogingRequestModel(String pwd, Long studentMobileNumber) {
		super();
		this.pwd = pwd;
		this.studentMobileNumber = studentMobileNumber;
	}
	
	public StudentLogingRequestModel(){}
	@Override
	public String toString() {
		return "StudentLogingRequestModel [pwd=" + pwd + ", studentMobileNumber=" + studentMobileNumber + "]";
	}
	
	

}

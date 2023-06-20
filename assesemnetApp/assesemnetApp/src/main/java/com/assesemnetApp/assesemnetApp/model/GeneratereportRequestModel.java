package com.assesemnetApp.assesemnetApp.model;

public class GeneratereportRequestModel {
	
	Long clientId;
	String examdate;
	
	
	
	
	public Long getClientId() {
		return clientId;
	}




	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}




	public String getExamdate() {
		return examdate;
	}




	public void setExamdate(String examdate) {
		this.examdate = examdate;
	}




	public GeneratereportRequestModel(Long clientId, String examdate) {
		super();
		this.clientId = clientId;
		this.examdate = examdate;
	}

	public GeneratereportRequestModel(){}


	@Override
	public String toString() {
		return "GeneratereportRequestModel [clientId=" + clientId + ", examdate=" + examdate + "]";
	}
	
	

}

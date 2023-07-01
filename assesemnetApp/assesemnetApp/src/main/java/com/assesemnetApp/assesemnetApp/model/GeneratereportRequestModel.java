package com.assesemnetApp.assesemnetApp.model;

public class GeneratereportRequestModel {

	Long examId;

	public Long getExamId() {
		return examId;
	}

	public void setExamId(Long examId) {
		this.examId = examId;
	}

	@Override
	public String toString() {
		return "GeneratereportRequestModel [examId=" + examId + "]";
	}

	public GeneratereportRequestModel(Long examId) {
		super();
		this.examId = examId;
	}
	
	public GeneratereportRequestModel() {}

}

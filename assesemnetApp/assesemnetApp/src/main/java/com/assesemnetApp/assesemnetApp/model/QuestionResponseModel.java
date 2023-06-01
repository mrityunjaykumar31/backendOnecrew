package com.assesemnetApp.assesemnetApp.model;

import java.util.List;

import com.assesemnetApp.assesemnetApp.entity.ClientEntity;



 
public class QuestionResponseModel {

	String subject;
	String message;
	boolean isSuccess;
	List <QuestionDetails> question;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public List<QuestionDetails> getQuestion() {
		return question;
	}
	public void setQuestion(List<QuestionDetails> question) {
		this.question = question;
	}
	public QuestionResponseModel(String subject, String message, boolean isSuccess, List<QuestionDetails> question) {
		super();
		this.subject = subject;
		this.message = message;
		this.isSuccess = isSuccess;
		this.question = question;
	}
	@Override
	public String toString() {
		return "QuestionResponseModel [subject=" + subject + ", message=" + message + ", isSuccess=" + isSuccess
				+ ", question=" + question + "]";
	}
	
	public QuestionResponseModel(){}
	
}

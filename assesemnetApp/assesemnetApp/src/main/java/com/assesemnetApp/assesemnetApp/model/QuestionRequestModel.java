package com.assesemnetApp.assesemnetApp.model;

import java.util.List;

import com.assesemnetApp.assesemnetApp.entity.ClientEntity;

public class QuestionRequestModel {

	
	private String questionName;
	private String questionAnswer;
	private String questionSet;
	private String questionStream;
	
	 private Long clientId;
	private List<Option> questionOptions;
	
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	public String getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public String getQuestionSet() {
		return questionSet;
	}
	public void setQuestionSet(String questionSet) {
		this.questionSet = questionSet;
	}
	public String getQuestionStream() {
		return questionStream;
	}
	public void setQuestionStream(String questionStream) {
		this.questionStream = questionStream;
	}
	public Long getClientId() {
		return clientId;
	}
	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}
	public List<Option> getQuestionOptions() {
		return questionOptions;
	}
	public void setQuestionOptions(List<Option> questionOptions) {
		this.questionOptions = questionOptions;
	}
	public QuestionRequestModel(String questionName, String questionAnswer, String questionSet, String questionStream,
			Long clientId, List<Option> questionOptions) {
		super();
		this.questionName = questionName;
		this.questionAnswer = questionAnswer;
		this.questionSet = questionSet;
		this.questionStream = questionStream;
		this.clientId = clientId;
		this.questionOptions = questionOptions;
	}
	
	public QuestionRequestModel() {};
	@Override
	public String toString() {
		return "QuestionRequestModel [questionName=" + questionName + ", questionAnswer=" + questionAnswer
				+ ", questionSet=" + questionSet + ", questionStream=" + questionStream + ", clientId=" + clientId
				+ ", questionOptions=" + questionOptions + "]";
	}
	
}

package com.assesemnetApp.assesemnetApp.model;

import java.util.List;

import com.assesemnetApp.assesemnetApp.entity.ClientEntity;

public class Question {
	

	private Long questionId;

	private String questionName;
	private String questionAnswer;
	private String questionSet;
	private String questionStream;
	
	 private ClientEntity client;
	private List<Option> questionOptions;
	
	public Long getQuestionId() {
		return questionId;
	}
	
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
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
	public List<Option> getQuestionOptions() {
		return questionOptions;
	}
	public void setQuestionOptions(List<Option> questionOptions) {
		this.questionOptions = questionOptions;
	}
	
	
	public Question(Long questionId, String questionName, String questionAnswer, String questionSet,
			String questionStream, ClientEntity client, List<Option> questionOptions) {
		super();
		this.questionId = questionId;
		this.questionName = questionName;
		this.questionAnswer = questionAnswer;
		this.questionSet = questionSet;
		this.questionStream = questionStream;
		this.client = client;
		this.questionOptions = questionOptions;
	}
	
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionName=" + questionName + ", questionAnswer="
				+ questionAnswer + ", questionSet=" + questionSet + ", questionStream=" + questionStream + ", client="
				+ client + ", questionOptions=" + questionOptions + "]";
	}
	Question(){}
	public ClientEntity getClient() {
		return client;
	}
	public void setClient(ClientEntity client) {
		this.client = client;
	};
	
	
}

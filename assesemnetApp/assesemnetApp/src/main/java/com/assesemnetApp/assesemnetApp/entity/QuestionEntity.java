package com.assesemnetApp.assesemnetApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class QuestionEntity{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long QuestionId;
	private String QuestionName;
	private String QuestionAnswer;
	private String QuestionSet;
	private String QuestionStream;
	private String ClientId;

	
	
	public QuestionEntity(Long questionId, String questionName, String questionAnswer, String questionSet,
			String questionStream, String clientId) {
		super();
		QuestionId = questionId;
		QuestionName = questionName;
		QuestionAnswer = questionAnswer;
		QuestionSet = questionSet;
		QuestionStream = questionStream;
		ClientId = clientId;
	}



	public Long getQuestionId() {
		return QuestionId;
	}



	public void setQuestionId(Long questionId) {
		QuestionId = questionId;
	}



	public String getQuestionName() {
		return QuestionName;
	}



	public void setQuestionName(String questionName) {
		QuestionName = questionName;
	}



	public String getQuestionAnswer() {
		return QuestionAnswer;
	}



	public void setQuestionAnswer(String questionAnswer) {
		QuestionAnswer = questionAnswer;
	}



	public String getQuestionSet() {
		return QuestionSet;
	}



	public void setQuestionSet(String questionSet) {
		QuestionSet = questionSet;
	}



	public String getQuestionStream() {
		return QuestionStream;
	}



	public void setQuestionStream(String questionStream) {
		QuestionStream = questionStream;
	}



	public String getClientId() {
		return ClientId;
	}



	public void setClientId(String clientId) {
		ClientId = clientId;
	}



	public QuestionEntity() {}

	@Override
	public String toString() {
		return "QuestionEntity [QuestionId=" + QuestionId + ", QuestionName=" + QuestionName + ", QuestionAnswer="
				+ QuestionAnswer + ", QuestionSet=" + QuestionSet + ", QuestionStream=" + QuestionStream + ", ClientId="
				+ ClientId + "]";
	};
}
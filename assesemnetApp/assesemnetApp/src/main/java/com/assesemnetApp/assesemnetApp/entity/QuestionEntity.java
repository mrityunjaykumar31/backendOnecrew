package com.assesemnetApp.assesemnetApp.entity;

//import java.util.ArrayList;
import java.util.List;

import com.assesemnetApp.assesemnetApp.model.Option;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


@Entity
public class QuestionEntity{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long questionId;
	
	private String questionName;
	private String questionAnswer;
	private String questionSet;
	private String questionStream;
	private String clientId;
	private String questionOptions;
	
	
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
	public String getClientId  () {
		return clientId  ;
	}
	public void setclientId  (String clientId  ) {
		this.clientId   = clientId  ;
	}
	public String getQuestionOptions() {
		return questionOptions;
	}
	public void setQuestionOptions(String questionOptions) {
		this.questionOptions = questionOptions;
	}
	@Override
	public String toString() {
		return "QuestionEntity [questionId=" + questionId + ", questionName=" + questionName + ", questionAnswer="
				+ questionAnswer + ", questionSet=" + questionSet + ", questionStream=" + questionStream + ", clientId  ="
				+ clientId   + ", questionOptions=" + questionOptions + ", getQuestionId()=" + getQuestionId()
				+ ", getQuestionName()=" + getQuestionName() + ", getQuestionAnswer()=" + getQuestionAnswer()
				+ ", getQuestionSet()=" + getQuestionSet() + ", getQuestionStream()=" + getQuestionStream()
				+ ", getclientId  ()=" + getClientId  () + ", getQuestionOptions()=" + getQuestionOptions()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public QuestionEntity(Long questionId, String questionName, String questionAnswer, String questionSet,
			String questionStream, String clientId, String questionOptions) {
		super();
		this.questionId = questionId;
		this.questionName = questionName;
		this.questionAnswer = questionAnswer;
		this.questionSet = questionSet;
		this.questionStream = questionStream;
		this.clientId = clientId;
		this.questionOptions = questionOptions;
	}
	
	QuestionEntity(){}
}

	
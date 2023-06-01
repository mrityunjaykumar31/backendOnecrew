package com.assesemnetApp.assesemnetApp.entity;

//import java.util.ArrayList;
import java.util.List;

import com.assesemnetApp.assesemnetApp.model.Option;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	private String questionOptions;
	
	
	@ManyToOne
	@JoinColumn(name="clientid")
	private ClientEntity client;
	
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
	
	
	public ClientEntity getClient() {
		return client;
	}
	public void setClient(ClientEntity client) {
		this.client = client;
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
				+ questionAnswer + ", questionSet=" + questionSet + ", questionStream=" + questionStream
				+ ", questionOptions=" + questionOptions + "]";
	}
	public QuestionEntity(Long questionId, String questionName, String questionAnswer, String questionSet,
			String questionStream, String questionOptions, ClientEntity client) {
		super();
		this.questionId = questionId;
		this.questionName = questionName;
		this.questionAnswer = questionAnswer;
		this.questionSet = questionSet;
		this.questionStream = questionStream;
		this.questionOptions = questionOptions;
		this.client = client;
	}

	
	public QuestionEntity(){}
}

	
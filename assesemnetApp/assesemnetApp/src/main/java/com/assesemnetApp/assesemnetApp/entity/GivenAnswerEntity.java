package com.assesemnetApp.assesemnetApp.entity;

import javax.persistence.CascadeType;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.assesemnetApp.assesemnetApp.model.Question;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class GivenAnswerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long givenAnsid;
	private  String questionAnswer;
	
	@ManyToOne
	@JoinColumn(name="answerid", nullable =false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private AnswerEntity answerEntity;
	
	 @OneToOne
	 @JoinColumn(name = "questionId")
	 @OnDelete(action = OnDeleteAction.CASCADE)
	// @JsonIgnore
	private QuestionEntity questionentity;

	 


	public Long getGivenAnsid() {
		return givenAnsid;
	}




	public void setGivenAnsid(Long givenAnsid) {
		this.givenAnsid = givenAnsid;
	}




	public String getQuestionAnswer() {
		return questionAnswer;
	}




	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}




	public AnswerEntity getAnswerEntity() {
		return answerEntity;
	}




	public void setAnswerEntity(AnswerEntity answerEntity) {
		this.answerEntity = answerEntity;
	}




	public QuestionEntity getQuestionentity() {
		return questionentity;
	}




	public void setQuestionentity(QuestionEntity questionentity) {
		this.questionentity = questionentity;
	}




	public GivenAnswerEntity(Long givenAnsid, String questionAnswer, AnswerEntity answerEntity,
			QuestionEntity questionentity) {
		super();
		this.givenAnsid = givenAnsid;
		this.questionAnswer = questionAnswer;
		this.answerEntity = answerEntity;
		this.questionentity = questionentity;
	}




	public GivenAnswerEntity() {}

}

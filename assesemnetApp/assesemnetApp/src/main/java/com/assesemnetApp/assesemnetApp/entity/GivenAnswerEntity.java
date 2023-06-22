package com.assesemnetApp.assesemnetApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class GivenAnswerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long givenAnsid;
	
	private Long questionId;
	private  String questionAnswer;
	
	@ManyToOne
	@JoinColumn(name="answerid")
	private AnswerEntity answerEntity;

	public Long getGivenAnsid() {
		return givenAnsid;
	}

	public void setGivenAnsid(Long givenAnsid) {
		this.givenAnsid = givenAnsid;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
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

	public GivenAnswerEntity(Long givenAnsid, Long questionId, String questionAnswer, AnswerEntity answerEntity) {
		super();
		this.givenAnsid = givenAnsid;
		this.questionId = questionId;
		this.questionAnswer = questionAnswer;
		this.answerEntity = answerEntity;
	}

	@Override
	public String toString() {
		return "GivenAnswerEntity [givenAnsid=" + givenAnsid + ", questionId=" + questionId + ", questionAnswer="
				+ questionAnswer + "]";
	}
	
	
	public GivenAnswerEntity() {}

}

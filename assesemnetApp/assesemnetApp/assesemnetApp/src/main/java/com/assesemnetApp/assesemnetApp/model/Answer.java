package com.assesemnetApp.assesemnetApp.model;

public class Answer {
	
	Long questionId;
	String questionAnswer;
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
	@Override
	public String toString() {
		return "Answer [questionId=" + questionId + ", questionAnswer=" + questionAnswer + "]";
	}
	public Answer(Long questionId, String questionAnswer) {
		super();
		this.questionId = questionId;
		this.questionAnswer = questionAnswer;
	}
	
	Answer(){}
}

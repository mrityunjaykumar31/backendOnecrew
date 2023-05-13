package com.assesemnetApp.assesemnetApp.model;

public class Answer {
	
	Long questionId;
	String ans;
	
	

	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	
	public Answer(Long questionId, String ans) {
		super();
		this.questionId = questionId;
		this.ans = ans;
	}
	
	Answer(){}
	@Override
	public String toString() {
		return "Answer [questionId=" + questionId + ", ans=" + ans + ", getQuestionId()=" + getQuestionId()
				+ ", getAns()=" + getAns() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}

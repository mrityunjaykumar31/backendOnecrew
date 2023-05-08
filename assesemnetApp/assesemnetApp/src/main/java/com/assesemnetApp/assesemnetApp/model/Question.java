package com.assesemnetApp.assesemnetApp.model;

import java.util.List;

public class Question {
	

	private Long QuestionId;
	private String QuestionName;
	private String QuestionAnswer;
	private String QuestionSet;
	private String QuestionStream;
	private String ClientId;
	private List<Option> QuestionOptions;
	
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
	public List<Option> getQuestionOptions() {
		return QuestionOptions;
	}
	public void setQuestionOptions(List<Option> questionOptions) {
		QuestionOptions = questionOptions;
	}
	public Question(Long questionId, String questionName, String questionAnswer, String questionSet,
			String questionStream, String clientId, List<Option> questionOptions) {
		super();
		QuestionId = questionId;
		QuestionName = questionName;
		QuestionAnswer = questionAnswer;
		QuestionSet = questionSet;
		QuestionStream = questionStream;
		ClientId = clientId;
		QuestionOptions = questionOptions;
	}

	Question(){}
	
	@Override
	public String toString() {
		return "Question [QuestionId=" + QuestionId + ", QuestionName=" + QuestionName + ", QuestionAnswer="
				+ QuestionAnswer + ", QuestionSet=" + QuestionSet + ", QuestionStream=" + QuestionStream + ", ClientId="
				+ ClientId + ", QuestionOptions=" + QuestionOptions + "]";
	}
}

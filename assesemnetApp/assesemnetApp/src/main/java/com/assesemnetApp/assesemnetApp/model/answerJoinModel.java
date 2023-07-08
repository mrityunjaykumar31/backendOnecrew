package com.assesemnetApp.assesemnetApp.model;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.assesemnetApp.assesemnetApp.entity.AnswerEntity;
import com.assesemnetApp.assesemnetApp.entity.ClientEntity;
import com.assesemnetApp.assesemnetApp.entity.StudentEntity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SqlResultSetMapping;

public class answerJoinModel {
	
	String question_answer;
	Long given_ansid;
	Long question_id;
	Long answerid;
	Long student_id;
	Timestamp start_time;
	Timestamp end_time;
	Long clientid;
	Long exam_id;
	
	String originalAnswer;
	
	
	
public String getQuestion_answer() {
		return question_answer;
	}



	public void setQuestion_answer(String question_answer) {
		this.question_answer = question_answer;
	}



	public Long getGiven_ansid() {
		return given_ansid;
	}



	public void setGiven_ansid(Long given_ansid) {
		this.given_ansid = given_ansid;
	}



	public Long getQuestion_id() {
		return question_id;
	}



	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}



	public Long getAnswerid() {
		return answerid;
	}



	public void setAnswerid(Long answerid) {
		this.answerid = answerid;
	}



	public Long getStudent_id() {
		return student_id;
	}



	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}



	public Timestamp getStart_time() {
		return start_time;
	}



	public void setStart_time(Timestamp start_time) {
		this.start_time = start_time;
	}



	public Timestamp getEnd_time() {
		return end_time;
	}



	public void setEnd_time(Timestamp end_time) {
		this.end_time = end_time;
	}



	public Long getClientid() {
		return clientid;
	}



	public void setClientid(Long clientid) {
		this.clientid = clientid;
	}



	public Long getExam_id() {
		return exam_id;
	}



	public void setExam_id(Long exam_id) {
		this.exam_id = exam_id;
	}



	public String getOriginalAnswer() {
		return originalAnswer;
	}



	public void setOriginalAnswer(String originalAnswer) {
		this.originalAnswer = originalAnswer;
	}



@Override
	public String toString() {
		return "answerJoinModel [question_answer=" + question_answer + ", given_ansid=" + given_ansid + ", question_id="
				+ question_id + ", answerid=" + answerid + ", student_id=" + student_id + ", start_time=" + start_time
				+ ", end_time=" + end_time + ", clientid=" + clientid + ", exam_id=" + exam_id + ", originalAnswer="
				+ originalAnswer + "]";
	}



public answerJoinModel(String question_answer, Long given_ansid, Long question_id, Long answerid, Long student_id,
		Timestamp start_time, Timestamp end_time, Long clientid, Long exam_id, String originalAnswer) {
	super();
	this.question_answer = question_answer;
	this.given_ansid = given_ansid;
	this.question_id = question_id;
	this.answerid = answerid;
	this.student_id = student_id;
	this.start_time = start_time;
	this.end_time = end_time;
	this.clientid = clientid;
	this.exam_id = exam_id;
	this.originalAnswer = originalAnswer;
}



public answerJoinModel() {}
}

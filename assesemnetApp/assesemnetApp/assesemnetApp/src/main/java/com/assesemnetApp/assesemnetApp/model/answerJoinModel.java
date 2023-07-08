package com.assesemnetApp.assesemnetApp.model;

import java.sql.Timestamp;

import com.assesemnetApp.assesemnetApp.entity.AnswerEntity;
import com.assesemnetApp.assesemnetApp.entity.ClientEntity;
import com.assesemnetApp.assesemnetApp.entity.StudentEntity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SqlResultSetMapping;


public class answerJoinModel {
	Long given_ansid;
	String question_answer;
	Long question_id;
	String answerid;
	Long student_id;
	Timestamp start_time;
	Timestamp end_time;
	Long clientid;
	Long exam_id;
	public Long getGiven_ansid() {
		return given_ansid;
	}
	public void setGiven_ansid(Long given_ansid) {
		this.given_ansid = given_ansid;
	}
	public String getQuestion_answer() {
		return question_answer;
	}
	public void setQuestion_answer(String question_answer) {
		this.question_answer = question_answer;
	}
	public Long getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}
	public String getAnswerid() {
		return answerid;
	}
	public void setAnswerid(String answerid) {
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
	
	public answerJoinModel(Long given_ansid, String question_answer, Long question_id, String answerid, Long student_id,
			Timestamp start_time, Timestamp end_time, Long clientid, Long exam_id) {
		super();
		this.given_ansid = given_ansid;
		this.question_answer = question_answer;
		this.question_id = question_id;
		this.answerid = answerid;
		this.student_id = student_id;
		this.start_time = start_time;
		this.end_time = end_time;
		this.clientid = clientid;
		this.exam_id = exam_id;
	}
	@Override
	public String toString() {
		return "answerJoinModel [given_ansid=" + given_ansid + ", question_answer=" + question_answer + ", question_id="
				+ question_id + ", answerid=" + answerid + ", student_id=" + student_id + ", start_time=" + start_time
				+ ", end_time=" + end_time + ", clientid=" + clientid + ", exam_id=" + exam_id + "]";
	}
	public answerJoinModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/*
	 * public answerJoinModel() {
	 * 
	 * }
	 */

	


}

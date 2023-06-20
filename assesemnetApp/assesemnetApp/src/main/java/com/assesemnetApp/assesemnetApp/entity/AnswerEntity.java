package com.assesemnetApp.assesemnetApp.entity;

import java.sql.Timestamp;

import com.assesemnetApp.assesemnetApp.model.Answer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class AnswerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long answerid;
	
	@ManyToOne
	@JoinColumn(name="studentId")
	private StudentEntity student;
	@ManyToOne
	@JoinColumn(name="clientid")
	private ClientEntity client;
	
	private String answer;
	private Timestamp startTime;
	private Timestamp endTime;

	
	public AnswerEntity(Long answerid, ClientEntity client, StudentEntity student, String answer, Timestamp startTime, Timestamp endTime) {
		super();
		this.answerid = answerid;
		this.student = student;
		this.answer = answer;
		this.startTime = startTime;
		this.endTime = endTime;
		this.client = client;
	}



	public Timestamp getStartTime() {
		return startTime;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Timestamp getsetStartTimes() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	



	@Override
	public String toString() {
		return "AnswerEntity [answerid=" + answerid + ", answer=" + answer + ", startTime="
				+ startTime + ", endTime=" + endTime + ", studentId=" + student.toString() + "]";
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public AnswerEntity(){}
	

	public Long getAnswerid() {
		return answerid;
	}

	public void setAnswerid(Long answerid) {
		this.answerid = answerid;
	}

	

	public StudentEntity getStudent() {
		return student;
	}

	public void setStudent(StudentEntity student) {
		this.student = student;
	}



	public ClientEntity getClient() {
		return client;
	}



	public void setClient(ClientEntity client) {
		this.client = client;
	}

	
}

package com.assesemnetApp.assesemnetApp.entity;

import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.CascadeType;

import com.assesemnetApp.assesemnetApp.model.Answer;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "answerEntity")
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
	

	private Timestamp startTime;
	private Timestamp endTime;
	private Long examId;


	public AnswerEntity(Long answerid, StudentEntity student, ClientEntity client, Timestamp startTime,
			Timestamp endTime, Long examId) {
		super();
		this.answerid = answerid;
		this.student = student;
		this.client = client;
		this.startTime = startTime;
		this.endTime = endTime;
		this.examId = examId;
	}

	public AnswerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public Long getExamId() {
		return examId;
	}

	public void setExamId(Long examId) {
		this.examId = examId;
	}


	@Override
	public String toString() {
		return "AnswerEntity [answerid=" + answerid + ", student=" + student.toString() + ", client=" + client + ", startTime="
				+ startTime + ", endTime=" + endTime + ", examId=" + examId + "]";
	}
	
		
}

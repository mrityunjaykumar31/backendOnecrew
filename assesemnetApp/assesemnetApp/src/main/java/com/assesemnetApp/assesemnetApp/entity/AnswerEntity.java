package com.assesemnetApp.assesemnetApp.entity;

import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.CascadeType;

import com.assesemnetApp.assesemnetApp.model.Answer;

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

	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "answerEntity")
	private List<GivenAnswerEntity> givenAnswerEntity;
	
	public AnswerEntity(Long answerid, ClientEntity client, StudentEntity student,  Timestamp startTime, Timestamp endTime) {
		super();
		this.answerid = answerid;
		this.student = student;
		
		this.startTime = startTime;
		this.endTime = endTime;
		this.client = client;
	}



	public Timestamp getStartTime() {
		return startTime;
	}

	

	public Timestamp getsetStartTimes() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	



	@Override
	public String toString() {
		return "AnswerEntity [answerid=" + answerid + ",  startTime="
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



	public void setAnswer(List<Answer> answer) {
		// TODO Auto-generated method stub
		
	}



	public List<GivenAnswerEntity> getGivenAnswerEntity() {
		return givenAnswerEntity;
	}



	public void setGivenAnswerEntity(List<GivenAnswerEntity> givenAnswerEntity) {
		this.givenAnswerEntity = givenAnswerEntity;
	}

	
}

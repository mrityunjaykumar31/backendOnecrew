package com.assesemnetApp.assesemnetApp.entity;

import com.assesemnetApp.assesemnetApp.model.Answer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class AnswerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long answerid;
	
	@OneToOne
	@JoinColumn(name="studentId")
	private StudentEntity student;
	
	private String answer;
	private Long timeStamp;
	
	public AnswerEntity(Long answerid, ClientEntity client, StudentEntity student, String answer, Long timeStamp) {
		super();
		this.answerid = answerid;
		this.student = student;
		this.answer = answer;
		this.timeStamp = timeStamp;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	
	
	@Override
	public String toString() {
		return "AnswerEntity [answerid=" + answerid + ", student=" + student + ", answer="
				+ answer + ", timeStamp=" + timeStamp + "]";
	}


	public AnswerEntity(){}
	public AnswerEntity(StudentEntity student2, Answer answer2) {
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

}

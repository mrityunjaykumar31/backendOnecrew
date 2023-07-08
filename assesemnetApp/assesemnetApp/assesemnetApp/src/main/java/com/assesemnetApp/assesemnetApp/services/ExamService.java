package com.assesemnetApp.assesemnetApp.services;

import java.util.List;

import com.assesemnetApp.assesemnetApp.entity.ExamEntity;
import com.assesemnetApp.assesemnetApp.model.ExamRequestModel;

public interface ExamService {
	
	public ExamEntity createExam(ExamRequestModel examEntity);
	public List<ExamEntity> getExam(Long id);
}

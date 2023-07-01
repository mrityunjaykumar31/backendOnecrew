package com.assesemnetApp.assesemnetApp.services;

import com.assesemnetApp.assesemnetApp.entity.ExamEntity;
import com.assesemnetApp.assesemnetApp.model.ExamRequestModel;

public interface ExamService {
	
	public ExamEntity createExam(ExamRequestModel examEntity);

}

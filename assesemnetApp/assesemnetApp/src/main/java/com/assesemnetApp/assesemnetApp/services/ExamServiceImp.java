package com.assesemnetApp.assesemnetApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import java.sql.Timestamp;
import org.springframework.stereotype.Service;

import com.assesemnetApp.assesemnetApp.entity.ExamEntity;
import com.assesemnetApp.assesemnetApp.model.ExamRequestModel;
import com.assesemnetApp.assesemnetApp.repository.ExamRepository;

@Service
public class ExamServiceImp  implements ExamService {

	@Autowired 
	private ExamRepository examRepository;
	@Autowired
	private UtilsService utilsService;
	@Override
	public ExamEntity createExam(ExamRequestModel examEntity) {
		// TODO Auto-generated method stub
		ExamEntity entity = new ExamEntity();
		entity.setExamStartTime(this.utilsService.parseSqlDate(examEntity.getExamStartTime()));
		entity.setExamEndTime(this.utilsService.parseSqlDate(examEntity.getExamEndTime()));
		entity.setExamName(examEntity.getExamName());
		entity.setTotalquestion(examEntity.getTotalquestion());
		entity.setExamDuration(examEntity.getExamDuration());
		return this.examRepository.save(entity);
	}

}

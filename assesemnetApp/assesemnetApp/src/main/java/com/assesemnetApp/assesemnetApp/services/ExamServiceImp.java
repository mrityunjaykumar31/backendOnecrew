package com.assesemnetApp.assesemnetApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Service;

import com.assesemnetApp.assesemnetApp.entity.ClientEntity;
import com.assesemnetApp.assesemnetApp.entity.ExamEntity;
import com.assesemnetApp.assesemnetApp.model.ExamRequestModel;
import com.assesemnetApp.assesemnetApp.repository.ClientRepository;
import com.assesemnetApp.assesemnetApp.repository.ExamRepository;

@Service
public class ExamServiceImp  implements ExamService {

	@Autowired 
	private ExamRepository examRepository;
	@Autowired
	private ClientRepository ClientRepo;
	@Autowired
	private UtilsService utilsService;
	@Override
	public ExamEntity createExam(ExamRequestModel examEntity) {
		// TODO Auto-generated method stub
		ClientEntity client = ClientRepo.findById(examEntity.getClientId()).orElseThrow(() -> new IllegalArgumentException("Invalid Client ID for" +examEntity.getClientId()));
		ExamEntity entity = new ExamEntity();
		entity.setExamStartTime(this.utilsService.parseSqlDate(examEntity.getExamStartTime()));
		entity.setExamEndTime(this.utilsService.parseSqlDate(examEntity.getExamEndTime()));
		entity.setExamName(examEntity.getExamName());
		entity.setTotalquestion(examEntity.getTotalquestion());
		entity.setExamDuration(examEntity.getExamDuration());
		entity.setClient(client);
		return this.examRepository.save(entity);
	}
	@Override
	public List<ExamEntity> getExam(Long id) {
		// TODO Auto-generated method stub
		return this.examRepository.findByClient_Clientid(id);
		
	}

}

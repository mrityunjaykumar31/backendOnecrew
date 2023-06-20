package com.assesemnetApp.assesemnetApp.services;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesemnetApp.assesemnetApp.entity.AnswerEntity;
import com.assesemnetApp.assesemnetApp.entity.ClientEntity;
import com.assesemnetApp.assesemnetApp.entity.StudentEntity;
import com.assesemnetApp.assesemnetApp.model.Answer;
import com.assesemnetApp.assesemnetApp.model.AnswerResponseModel;
import com.assesemnetApp.assesemnetApp.repository.AnswerRepository;
import com.assesemnetApp.assesemnetApp.repository.ClientRepository;
import com.assesemnetApp.assesemnetApp.repository.StudentRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AnswerServiceImp implements AnswerService  {
	
	@Autowired
	private ClientRepository ClientRepo;
	@Autowired
	private StudentRepository StudentRepo;
	@Autowired
	private AnswerRepository AnsRepo;
	
	@Autowired
	 private ObjectMapper jacksonObjectMapper;
	@Autowired
	private UtilsService utilsService;

	@Override
	public AnswerEntity saveAnswer(AnswerResponseModel answerResponseModel) {
		// TODO Auto-generated method stub
		ClientEntity client = null;
		StudentEntity student = null;
		String jsonInString = null;
		client = ClientRepo.findById(answerResponseModel.getClientid()).orElseThrow(() -> new IllegalArgumentException("Invalid Client ID"));
		//student = StudentRepo.findBystudentIdAndClient(studentId, client).orElseThrow(() -> new IllegalArgumentException("Invalid Client ID"));
		student = StudentRepo.findBystudentIdAndClient(answerResponseModel.getStudentId(), client);
		try {
			jsonInString = jacksonObjectMapper.writeValueAsString(answerResponseModel.getAnswer());
		} catch(Exception e) {
			
		}
		AnswerEntity ans = new AnswerEntity();
		ans.setAnswer(jsonInString);
		ans.setStudent(student);
		ans.setEndTime(Timestamp.valueOf(answerResponseModel.getEndTime()));
		ans.setStartTime(Timestamp.valueOf(answerResponseModel.getStartTime()));
		//ans.setTimeStamp(null);
		ans.setClient(client);
	//	ans.
		return AnsRepo.save(ans);
	}

	@Override
	public List<AnswerEntity> findByDateAndClientId(Date date, Long clientId) {
		// TODO Auto-generated method stub
		return this.AnsRepo.findBystartTimeAndClient_Clientid(date, clientId);
	}

}

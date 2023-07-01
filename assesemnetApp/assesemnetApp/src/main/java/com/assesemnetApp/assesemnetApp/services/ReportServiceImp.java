package com.assesemnetApp.assesemnetApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.assesemnetApp.assesemnetApp.entity.ReportEntity;
import com.assesemnetApp.assesemnetApp.repository.ReportRepository;

public class ReportServiceImp implements ReportService {

	@Autowired
	private ReportRepository reportRepository;

	@Override
	public List<ReportEntity> findByExamId(Long examId) {
		// TODO Auto-generated method stub
		
		return this.reportRepository.findByExamId(examId);
	}
	


}

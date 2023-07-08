package com.assesemnetApp.assesemnetApp.services;

import java.util.List;

import com.assesemnetApp.assesemnetApp.entity.ReportEntity;

public interface ReportService {
	


	public List<ReportEntity> findByExamId(Long examId);

}

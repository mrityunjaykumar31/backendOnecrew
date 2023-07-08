package com.assesemnetApp.assesemnetApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assesemnetApp.assesemnetApp.entity.AdminEntity;
import com.assesemnetApp.assesemnetApp.entity.ClientEntity;
import com.assesemnetApp.assesemnetApp.entity.ReportEntity;

public interface ReportRepository extends JpaRepository<ReportEntity, Long>{

	public List<ReportEntity> findByExamId(Long examId);
}

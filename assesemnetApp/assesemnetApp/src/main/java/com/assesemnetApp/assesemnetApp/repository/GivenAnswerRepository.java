package com.assesemnetApp.assesemnetApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assesemnetApp.assesemnetApp.entity.AnswerEntity;
import com.assesemnetApp.assesemnetApp.entity.GivenAnswerEntity;

public interface GivenAnswerRepository extends JpaRepository<GivenAnswerEntity, Long> {
	
public List<GivenAnswerEntity> findByAnswerEntity_Answerid(Long id);

}

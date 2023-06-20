package com.assesemnetApp.assesemnetApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assesemnetApp.assesemnetApp.entity.KeyEntity;
import com.assesemnetApp.assesemnetApp.entity.QuestionEntity;

	
	
	@Repository
	public interface KeyRepository extends JpaRepository<KeyEntity, Long>{

}

package com.assesemnetApp.assesemnetApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assesemnetApp.assesemnetApp.entity.AnswerEntity;
import com.assesemnetApp.assesemnetApp.entity.StudentEntity;


public interface AnswerRepository extends JpaRepository<AnswerEntity, Long>{


}

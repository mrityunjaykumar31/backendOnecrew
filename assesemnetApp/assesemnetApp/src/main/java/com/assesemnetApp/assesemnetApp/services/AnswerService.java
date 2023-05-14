package com.assesemnetApp.assesemnetApp.services;

import java.util.List;

import com.assesemnetApp.assesemnetApp.entity.AnswerEntity;
import com.assesemnetApp.assesemnetApp.model.Answer;

public interface AnswerService {

	AnswerEntity saveAnswer(List<Answer> answer, Long clientId, Long studentId);
}

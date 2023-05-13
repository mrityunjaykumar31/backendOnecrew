package com.assesemnetApp.assesemnetApp.services;

import com.assesemnetApp.assesemnetApp.entity.AnswerEntity;
import com.assesemnetApp.assesemnetApp.model.Answer;

public interface AnswerService {

	AnswerEntity saveAnswer(Answer answer, Long clientId, Long studentId);
}

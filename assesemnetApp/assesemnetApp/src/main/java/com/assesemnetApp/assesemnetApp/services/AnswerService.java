package com.assesemnetApp.assesemnetApp.services;

import java.util.List;

import com.assesemnetApp.assesemnetApp.entity.AnswerEntity;
import com.assesemnetApp.assesemnetApp.model.Answer;
import com.assesemnetApp.assesemnetApp.model.AnswerResponseModel;

public interface AnswerService {

	AnswerEntity saveAnswer(AnswerResponseModel answerResponseModel);
}

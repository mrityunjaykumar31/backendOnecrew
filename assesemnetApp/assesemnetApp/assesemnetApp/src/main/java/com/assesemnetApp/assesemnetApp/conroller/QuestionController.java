package com.assesemnetApp.assesemnetApp.conroller;


import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assesemnetApp.assesemnetApp.entity.QuestionEntity;
import com.assesemnetApp.assesemnetApp.model.Question;
import com.assesemnetApp.assesemnetApp.model.QuestionRequestModel;
import com.assesemnetApp.assesemnetApp.model.QuestionResponseModel;
import com.assesemnetApp.assesemnetApp.model.QuestionDetails;
import com.assesemnetApp.assesemnetApp.services.QuestionService;
import com.assesemnetApp.assesemnetApp.services.UtilsService;



@RestController
public class QuestionController {

	@Autowired 
	QuestionService QuestionService;
	@Autowired
	UtilsService utilsService;
	
	@CrossOrigin(origins = "*")
	@PostMapping("/Question")
	public Question savestudent(@RequestParam(required=true, name = "clientId") Long clientId,@RequestBody Question Question) {
		
		return QuestionService.saveQuestion(Question, clientId);
		
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/questions")
public ResponseEntity<QuestionResponseModel> getQuestion(@RequestParam(required=false, name = "questionStream") String questionStream,
		@RequestParam(required=false, name ="clientId")Long clientId, @RequestParam int totalQuestion ) {
		
		//return QuestionService.saveQuestion(Question);
		
		
		
		List<Question> qe = QuestionService.findByQuestionStreamAndclientId(questionStream, clientId, totalQuestion);
	
		
		if(qe == null) {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}else {
			//System.out.println(questionStream + "from controller" + qe);
//		Object[] objectArray = qe.toArray();
//			Object[] qestion = this.utilsService.getRandomObjects(objectArray, totalQuestion);
////			
////
////	        // Ensure that the elements in the Object[] array are of type Question
//	        Question[] questionArray = Arrays.copyOf(qestion, qestion.length, Question[].class);
////
////	        // Convert the Question[] array to a List<Question>
//			List<Question> questionList = Arrays.asList(questionArray);
			
			QuestionResponseModel res = new QuestionResponseModel();
			
			if(qe.size() > 0) {
				
				res.setIsSuccess(true);
				res.setMessage(null);
				res.setSubject(questionStream);
				
				
				 List<QuestionDetails> qd = new ArrayList<>();;
				
				for (Question ques:  qe) {
					//System.out.println(ques + "from controller");
					QuestionDetails questionDetails = new QuestionDetails();
					questionDetails.setClientId(ques.getClient().getClientid());
					
					questionDetails.setQuestionId(ques.getQuestionId());
					questionDetails.setQuestionName(ques.getQuestionName());
					questionDetails.setQuestionOptions(ques.getQuestionOptions());
					questionDetails.setQuestionStream(ques.getQuestionStream());
					// System.out.println(questionDetails + "from controller");
					qd.add(questionDetails);
					
				}
				res.setQuestion(qd);
			
				return ResponseEntity.status(HttpStatus.OK).body(res);
				
			}else {
				res.setIsSuccess(false);
				res.setMessage("Not Found");
				res.setQuestion(null);
				return ResponseEntity.status(HttpStatus.OK).body(res);
			}
			
		
		}
		
	} 
	

	@CrossOrigin(origins = "*")
	@PostMapping("/questions")
	public String savestudents(@RequestBody List<QuestionRequestModel> Question) {
		
		return QuestionService.saveQuestions(Question);
		
	}
	

}



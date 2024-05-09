package com.testing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.testing.bean.Questionss;
import com.testing.repo.QuestionssRepo;

@Service
public class QuestionsService {

	@Autowired
	private QuestionssRepo questionssRepo;
	
//	public ResponseEntity<String> addQuestions(Questionss questionss) {
//		try {			
//			questionssRepo.save(questionss);
//			return ResponseEntity.ok("Questions Added Successfully");
//			
//		}catch(Exception e) {
//			return ResponseEntity.badRequest().body("Failed To  Add Questions");
//			
//		}	
//		
//	}
	
	public String addQuestions(Questionss questionss) {
		try {			
			questionssRepo.save(questionss);
			return "Questions Added Successfully";
			
		}catch(Exception e) {
			return "Failed To  Add Questions";
			
		}	
		
	}

	public List<Questionss> getAllQuestion() {
		
		return questionssRepo.findAll();
	}

	public Optional<Questionss> findQbyQuestionId(int questionId) {
		
		return questionssRepo.findById(questionId);
	}
	
}

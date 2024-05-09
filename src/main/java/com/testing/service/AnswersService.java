package com.testing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.testing.bean.Answers;
import com.testing.repo.AnswersRepo;

@Service
public class AnswersService {


	@Autowired
	private AnswersRepo answersRepo;
	
	
//	public ResponseEntity<String> addAnswers(Answers answers) {
//		try {			
//			answersRepo.save(answers);
//			return ResponseEntity.ok("Answers Added Successfully");
//			
//		}catch(Exception e) {
//			return ResponseEntity.badRequest().body("Failed To  Add Answers");
//			
//		}	
//		
//	}
	
	public String addAnswers(Answers answers) {
		try {			
			answersRepo.save(answers);
			return "Answers Added Successfully";
			
		}catch(Exception e) {
			return "Failed To  Add Answers";
			
		}	
		
	}


	public List<Answers> getAllAnswers() {		
		
	return answersRepo.findAll() ;
	}


	public Optional<Answers> findAnsbyAnswerId(int answerId) {
		
		return answersRepo.findById(answerId);
	}


	public List<Integer> getAllAnswerIds() {
		
		return answersRepo.getAllAnswerId();
	}
	
//	public String findAnswerByQuestionId(int questio) {
//        return answersRepo.findAnswerByQuestionId(questio);
//    }
	
}

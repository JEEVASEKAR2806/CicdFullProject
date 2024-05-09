package com.testing.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testing.bean.Assessment;
import com.testing.bean.Questionss;
import com.testing.service.QuestionsService;

@RestController
@CrossOrigin("http://localhost:3000")
public class QuestionssController {


	@Autowired	
	private QuestionsService questionsService;	
	

//	@PostMapping("/addQuestionDetails")
//	public ResponseEntity<String> addAdmin(@RequestBody Questionss Questionss) {
//		
//		return questionsService.addQuestions(Questionss);
//		
//	}
	
	@PostMapping("/addQuestionDetails")
	public String addAdmin(@RequestBody Questionss Questionss) {
		
		return questionsService.addQuestions(Questionss);
		
	}
	
	
	@GetMapping("/getAllQuestionDetails")
	public List<Questionss> getAllQuestion() {
		
		return questionsService.getAllQuestion();
		
	}
	
	
	@GetMapping("/findQbyQuestionId/{questionId}")
	public Optional<Questionss> findQbyQuestionId(@PathVariable("questionId") int questionId ) {
				
		return questionsService.findQbyQuestionId(questionId);
		
	}
	
	
	
	
	
	
	
	
	
}

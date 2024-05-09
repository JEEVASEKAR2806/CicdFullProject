package com.testing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testing.bean.Assessment;
import com.testing.service.AssessmentService;



@RestController
@CrossOrigin("http://localhost:3000")
public class AssessmentController {

	@Autowired	
	private AssessmentService assessmentService;	
	

	@PostMapping("/addAssessmentDetails")
	public String addAssessment(@RequestBody Assessment assessment) {
		
		return assessmentService.addAssessment(assessment);
		
	}
	
	@GetMapping("/getAllAssessmentDetails")
	public Object getAllAssessment() {
		
		return assessmentService.getAllAssessment();
		
	}
}

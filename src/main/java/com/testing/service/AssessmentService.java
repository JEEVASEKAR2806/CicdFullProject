package com.testing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.testing.bean.Assessment;
import com.testing.repo.AssessmentRepo;

@Service
public class AssessmentService {

	@Autowired
	private AssessmentRepo assessmentRepo;
	
	
	public String addAssessment(Assessment assessment) {
		try {			
			assessmentRepo.save(assessment);
			return "Successfully";
			
		}catch(Exception e) {
			return "Failed To  Add Assessment";
			
		}	
		
	}


	public Object getAllAssessment() {
		
		return assessmentRepo.findAll();
	}
	
//	public int getAllAssessment() {
//		
//		 try {			
//			 assessmentRepo.findAll();
//				return 1;
//				
//			}catch(Exception e) {
//				return 0;
//				
//			}	
//			
//	}

}

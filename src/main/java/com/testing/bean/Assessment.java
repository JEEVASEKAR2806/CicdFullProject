package com.testing.bean;

import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id; 
import jakarta.persistence.Table; 


@Entity 
@Table
public class Assessment { 
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int assessmentId; 
	private String assessmentType; 
	private String assessmentName;
	private String assessmentDate; 


	public Assessment() { 
		super(); 
} 
	public Assessment(int assessmentId, String assessmentType, String assessmentName, String assessmentDate) { 

		super(); 
		this.assessmentId = assessmentId; 
		this.assessmentType = assessmentType; 
		this.assessmentName = assessmentName; 
		this.assessmentDate = assessmentDate; 

	} 
	public int getAssessmentId() { 

		return assessmentId; 

	} 
	public void setAssessmentId(int assessmentId) { 

		this.assessmentId = assessmentId; 

	} 
	public String getAssessmentType() { 
		return assessmentType; 

	} 
	public void setAssessmentType(String assessmentType) { 
		this.assessmentType = assessmentType; 

	} public String getAssessmentName() { 
		return assessmentName; 

	} 
	public void setAssessmentName(String assessmentName) { 
		this.assessmentName = assessmentName; 

	} 
	public String getAssessmentDate() { 
		return assessmentDate; 

	} 
	public void setAssessmentDate(String assessmentDate) { 
		this.assessmentDate = assessmentDate; 

	}}
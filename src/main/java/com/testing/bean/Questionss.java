package com.testing.bean;

import jakarta.persistence.CascadeType; 

import jakarta.persistence.Entity; 

import jakarta.persistence.GeneratedValue; 

import jakarta.persistence.GenerationType; 

import jakarta.persistence.Id; 

import jakarta.persistence.JoinColumn; 

import jakarta.persistence.ManyToOne; 

import jakarta.persistence.Table; 



@Entity 
@Table 
public class Questionss { 
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int questionId;  
	private String questionType; 
	private String questionMarks; 
	private String questionDescription; 


	@ManyToOne(targetEntity = Assessment.class, cascade = CascadeType.DETACH) 
	@JoinColumn(name="assessmentId",nullable = false) 
	private Assessment assessment; 


	public Questionss() { 
		super(); 

	} 
	public Questionss(int questionId, String questionType, String questionMarks, String questionDescription, 

			Assessment assessment) { 

		super(); 
		this.questionId = questionId;
		this.questionType = questionType;
		this.questionMarks = questionMarks;
		this.questionDescription = questionDescription; 
		this.assessment = assessment; 

	} 
	public int getQuestionId() { 

		return questionId; 

	} 

	public void setQuestionId(int questionId) { 

		this.questionId = questionId; 

	} 

	public String getQuestionType() { 

		return questionType; 

	} 
	public void setQuestionType(String questionType) { 

		this.questionType = questionType; 

	} 
	public String getQuestionMarks() { 

		return questionMarks; 

	} 

	public void setQuestionMarks(String questionMarks) { 

		this.questionMarks = questionMarks; 

	} 

	public String getQuestionDescription() { 

		return questionDescription; 

	} 

	public void setQuestionDescription(String questionDescription) { 

		this.questionDescription = questionDescription; 

	} 

	public Assessment getAssessment() { 

		return assessment; 

	} 
	public void setAssessment(Assessment assessment) { 

		this.assessment = assessment; 

	} 
} 
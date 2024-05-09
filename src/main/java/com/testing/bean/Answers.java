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
public class Answers { 
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int answerId; 
	private String answerType; 
	private String correctOrNot; 	
	
	
	@ManyToOne(targetEntity = Questionss.class, cascade = CascadeType.DETACH) 
	@JoinColumn(name="questionId",nullable = false) 
	private Questionss questionss; 


	public Answers() { 
		super(); 

	} 
   
	public Answers(int answerId, String answerType, String correctOrNot, Questionss questionss) { 

		super(); 
		this.answerId = answerId;
		this.answerType = answerType; 
		this.correctOrNot = correctOrNot; 
		this.questionss = questionss; 

	} 





	public int getAnswerId() { 

		return answerId; 

	} 

	public void setAnswerId(int answerId) { 

		this.answerId = answerId; 

	} 
	public String getAnswerType() { 

		return answerType; 

	} 

	public void setAnswerType(String answerType) { 

		this.answerType = answerType; 

	} 
	public String getCorrectOrNot() { 

		return correctOrNot; 

	} 
	public void setCorrectOrNot(String correctOrNot) { 

		this.correctOrNot = correctOrNot; 

	} 
	public Questionss getQuestionss() { 

		return questionss; 

	} 
	public void setQuestionss(Questionss questionss) { 

		this.questionss = questionss; 

	} 
}
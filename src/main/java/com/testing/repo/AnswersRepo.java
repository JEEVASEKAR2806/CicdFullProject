package com.testing.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.testing.bean.Answers;


@Repository
public interface AnswersRepo extends JpaRepository<Answers, Integer> {

	@Query("select answerId from Answers")
	List<Integer> getAllAnswerId();

//	// @Query("SELECT a.answer FROM Answers a WHERE a.question.id = :questio")
//	 String findAnswerByQuestionId(@Param("questio") int questio);

} 

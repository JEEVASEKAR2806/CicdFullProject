package com.testing.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testing.bean.Assessment;

@Repository
public interface AssessmentRepo extends JpaRepository<Assessment, Integer> {

}

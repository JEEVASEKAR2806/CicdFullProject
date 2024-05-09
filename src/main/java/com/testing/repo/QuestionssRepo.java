package com.testing.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.testing.bean.Questionss;

@Repository
public interface QuestionssRepo extends JpaRepository<Questionss, Integer> {

} 

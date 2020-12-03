package com.springio.bibik2.repository;

import com.springio.bibik2.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}

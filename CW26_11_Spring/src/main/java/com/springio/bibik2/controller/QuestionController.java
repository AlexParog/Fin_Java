package com.springio.bibik2.controller;

import com.springio.bibik2.exceptions.ResourceNotFoundException;
import com.springio.bibik2.model.Question;
import com.springio.bibik2.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class QuestionController {
    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/questions")
    public Page<Question> getQuestion(Pageable pageable) {
        return questionRepository.findAll(pageable);
    }

    @PostMapping("/questions")
    public Question createQuestion(@Valid @RequestBody Question question){
        return questionRepository.save(question);
    }

    @PutMapping("/questions/{questionId}")
    public Question updateQuestions(@PathVariable Long questionId, @Valid @RequestBody Question questionRequest){
        return questionRepository.findById(questionId)
                .map(question -> {
                    question.setTitle(questionRequest.getTitle());
                    question.setDescription(questionRequest.getDescription());
                    return questionRepository.save(question);
                }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + questionId));
    }

    @DeleteMapping("questions/{questionId}")
    public ResponseEntity<?> deleteQuestion(@PathVariable Long questionId){
        return questionRepository.findById(questionId)
                .map(question -> {
                    questionRepository.delete(question);
                    return ResponseEntity.ok().build();
                }).orElseThrow(()-> new ResourceNotFoundException("Question not found with id " + questionId));
    }
}

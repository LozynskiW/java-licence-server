package com.javalicence.question;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QuestionFacade {

    private QuestionService questionService;

    @Autowired
    public QuestionFacade(QuestionService questionService) {
        this.questionService = questionService;
    }

    public QuestionModel getSingleRandomQuestion(String subject, String difficulty) {

        return this.questionService.getRandomQuestionByDifficulty(subject, difficulty);
    }

    public List<QuestionModel> getAllQuestions() {

        return questionService.getAllQuestions();
    }
}

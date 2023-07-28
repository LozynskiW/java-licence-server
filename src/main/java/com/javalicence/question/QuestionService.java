package com.javalicence.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class QuestionService {

    private QuestionRepo questionRepo;

    @Autowired
    public QuestionService(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    public List<QuestionModel> getAllQuestions() {
        return questionRepo.findAll();
    }

    @Aggregation(pipeline = {"{$sample:{size:1}}"})
    public QuestionModel getRandomQuestionByDifficulty(String subject, String difficulty) {

        if ((subject == null) && (difficulty == null)) return questionRepo.findRandom();

        return questionRepo.findRandomQuestion(subject, difficulty);
    }
}

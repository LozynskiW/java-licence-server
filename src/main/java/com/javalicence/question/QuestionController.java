package com.javalicence.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("javalicence/question")
class QuestionController {

    private QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public List<QuestionModel> getAllQuestions() {

        return questionService.getAllQuestions();
    }

    @RequestMapping(path = "/random", method = RequestMethod.GET)
    public QuestionModel getSingleRandomQuestion(@RequestParam(required = false) String subject, @RequestParam(required = false) String difficulty) {

        return this.questionService.getRandomQuestionByDifficulty(subject, difficulty);
    }

}

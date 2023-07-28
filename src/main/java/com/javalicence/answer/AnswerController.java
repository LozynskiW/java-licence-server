package com.javalicence.answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("javalicence/answer")
class AnswerController {

    private  AnswerService answerService;

    @Autowired
    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @PostMapping(path = "/check")
    public AnswerResponse checkAnswerForQuestionAndReturnExplanation(@RequestBody AnswerRequest answerRequest) {

        return answerService.checkAnswerForQuestionAndReturnExplanation(answerRequest);
    }
}

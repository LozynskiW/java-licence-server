package com.javalicence.answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
class AnswerService {

    private AnswerRepo answerRepo;

    @Autowired
    public AnswerService(AnswerRepo answerRepo) {
        this.answerRepo = answerRepo;
    }

    public AnswerResponse checkAnswerForQuestionAndReturnExplanation(AnswerRequest answerRequest) {

        Optional<AnswerModel> answerModelOptional = this.answerRepo.findAnswerForQuestionRequest(answerRequest.getAnswerId());

        AnswerModel answerModel = answerModelOptional.orElseThrow();

        AnswerResponse answerResponse = new AnswerResponse();

        answerResponse.setAnswerModel(answerModel);

        answerResponse.setWasAnswerCorrect(answerModel.getGoodAnswer().equals(answerRequest.getAnswer()));

        return answerResponse;

    }

}

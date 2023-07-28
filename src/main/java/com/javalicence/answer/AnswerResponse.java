package com.javalicence.answer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
class AnswerResponse {

    private AnswerModel answerModel;

    private boolean wasAnswerCorrect;
}

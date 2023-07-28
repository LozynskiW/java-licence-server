package com.javalicence.answer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
class AnswerRequest {

    @Field(value = "answerId")
    private String answerId;

    @Field(value = "answer")
    private String answer;
}

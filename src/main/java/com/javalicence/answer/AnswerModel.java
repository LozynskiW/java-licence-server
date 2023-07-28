package com.javalicence.answer;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document("answers")
class AnswerModel {

    @Id
    @Field(value = "_id")
    private ObjectId id;

    @Field(value = "questionId")
    private String answerId;

    @Field(value = "explanation")
    private String explanation;

    @Field(value = "goodAnswer")
    private String goodAnswer;
}

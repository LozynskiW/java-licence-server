package com.javalicence.question;

import com.mongodb.lang.NonNull;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.bson.types.ObjectId;


import java.math.BigInteger;
import java.util.List;
import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document("questions")
class QuestionModel {

    @Id
    @Field(value = "_id")
    private ObjectId id;

    @NonNull
    @Field(value = "subject")
    private String subject;

    @NonNull
    @Field(value = "question")
    private String question;
    @NonNull
    @Field(value = "goodAnswer")
    private String goodAnswer;
    @NonNull
    @Field(value = "badAnswers")
    private List<String> badAnswers;
    @NonNull
    @Field(value = "difficulty")
    private String difficulty;
    @NonNull
    @Field(value = "explanation")
    private String explanation;

    public QuestionModel(@NonNull ObjectId id,
                         @NonNull String question,
                         @NonNull String goodAnswer,
                         @NonNull List<String> badAnswers,
                         @NonNull QuestionDifficulty difficulty,
                         @NonNull String explanation) {
        this.id = id;
        this.question = question;
        this.goodAnswer = goodAnswer;
        this.badAnswers = badAnswers;
        this.difficulty = difficulty.toString();
        this.explanation = explanation;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuestionModel that)) return false;

        if (!id.equals(that.id)) return false;
        if (!question.equals(that.question)) return false;
        if (!goodAnswer.equals(that.goodAnswer)) return false;
        if (!badAnswers.equals(that.badAnswers)) return false;
        return difficulty == that.difficulty;
    }

    @Override
    public int hashCode() {
        int result = question.hashCode();
        result = 31 * result + id.hashCode();
        result = 31 * result + goodAnswer.hashCode();
        result = 31 * result + badAnswers.hashCode();
        result = 31 * result + difficulty.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "QuestionModel{" +
                "question='" + question + '\'' +
                ", goodAnswer='" + goodAnswer + '\'' +
                ", badAnswers=" + badAnswers +
                ", questionDifficulty=" + difficulty +
                '}';
    }
}

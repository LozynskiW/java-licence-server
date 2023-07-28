package com.javalicence.answer;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface AnswerRepo extends MongoRepository<AnswerModel, ObjectId> {

    @Aggregation(pipeline = {
            "{'$match':{'questionId':?0}}",
            "{'$sample':{size:1}}"
    })
    Optional<AnswerModel> findAnswerForQuestionRequest(String questionId);
}

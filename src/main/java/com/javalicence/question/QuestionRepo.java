package com.javalicence.question;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
interface QuestionRepo extends MongoRepository<QuestionModel, ObjectId> {

    @Query("{id:'?0'}")
    Optional<QuestionModel> findQuestionById(ObjectId id);


    @Aggregation(pipeline = {
            "{'$match':{'subject':?0, 'difficulty': ?1 }}",
            "{'$sample':{size:1}}"
    })
    QuestionModel findRandomQuestion(String subject, String difficulty);

    @Aggregation(pipeline = {
            "{'$match':{}}",
            "{'$sample':{size:1}}"
    })
    QuestionModel findRandom();

}

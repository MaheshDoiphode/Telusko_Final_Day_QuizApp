package org.telusko.services;

import org.telusko.entities.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getAllQuestions();

    Question getQuestionById(int id);

    Question addQuestion(Question question);

    Question updateQuestion(int id, Question question);

    void deleteQuestion(int id);
}

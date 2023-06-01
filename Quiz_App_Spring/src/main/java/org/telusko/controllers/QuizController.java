package org.telusko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telusko.entities.Question;
import org.telusko.services.QuestionService;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private final QuestionService questionService;

    @Autowired
    public QuizController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/questions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/questions/{id}")
    public Question getQuestionById(@PathVariable int id) {
        return questionService.getQuestionById(id);
    }

    @PostMapping("/questions")
    public Question addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    @PutMapping("/questions/{id}")
    public Question updateQuestion(@PathVariable int id, @RequestBody Question question) {
        return questionService.updateQuestion(id, question);
    }

    @DeleteMapping("/questions/{id}")
    public void deleteQuestion(@PathVariable int id) {
        questionService.deleteQuestion(id);
    }
}

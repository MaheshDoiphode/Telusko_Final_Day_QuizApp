import { Component, OnInit } from '@angular/core';
import { Question } from '../models/question';
import { TechStack } from '../models/tech-stack';
import { trigger, style, animate, transition } from '@angular/animations';

import { QuestionService } from '../services/question.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css'],
  animations: [
    trigger('fadeInOut', [
      transition(':enter', [
        style({ opacity: 0 }),
        animate('500ms', style({ opacity: 1 }))
      ]),
      transition(':leave', [
        animate('500ms', style({ opacity: 0 }))
      ])
    ])
  ]
})
export class AdminComponent implements OnInit {
  questions: Question[] = [];
  selectedQuestion!: Question;
  isEditMode = false;
  isAddMode = false;

  constructor(private questionService: QuestionService) {}

  ngOnInit() {
    this.loadQuestions();
  }

  loadQuestions() {
    this.questionService.getAllQuestions().subscribe((questions: Question[]) => {
      this.questions = questions;
    });
  }

  newAdd(){
    this.isAddMode = true;
      this.isEditMode = false;
  }
  addQuestion() {
    this.questionService.addQuestion(this.selectedQuestion).subscribe(() => {
      this.loadQuestions();
      this.selectedQuestion = this.questions[0]; // Reset the selected question
      this.isAddMode = false;
      this.isEditMode = false;
    });
  }

  editQuestion(question: Question) {
    this.selectedQuestion = { ...question };
    this.isAddMode = false;
    this.isEditMode = true;
  }

  saveQuestion() {
    if (this.isAddMode) {
      this.questionService.addQuestion(this.selectedQuestion).subscribe(() => {
        this.loadQuestions();
        this.selectedQuestion = new Question(); // Clear the selected question
        this.isAddMode = false;
        this.isEditMode = false;
      });
    } else if (this.isEditMode) {
      this.questionService.updateQuestion(this.selectedQuestion.id, this.selectedQuestion).subscribe(() => {
        this.loadQuestions();
        this.selectedQuestion = new Question(); // Clear the selected question
        this.isAddMode = false;
        this.isEditMode = false;
      });
    }
  }
  

  deleteQuestion(id: number) {
    this.questionService.deleteQuestion(id).subscribe(() => {
      this.loadQuestions();
    });
  }
}

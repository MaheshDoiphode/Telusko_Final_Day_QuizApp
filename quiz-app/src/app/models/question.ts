import { TechStack } from "./tech-stack";

export class Question {
    id: number = 0;
    question: string= '';
    option1: string = '';
    option2: string = '';
    option3: string = '';
    option4: string = '';
    correctAnswer: string = '';
    techStack: TechStack = new TechStack;
  }
  
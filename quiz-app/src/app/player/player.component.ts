// import { Component } from '@angular/core';
// import { Router } from '@angular/router';
// import { PlayerService } from '../services/player.service';
// import { TechStack } from '../models/tech-stack.model';
// import { Question } from '../models/question.model';

// @Component({
//   selector: 'app-player',
//   templateUrl: './player.component.html',
//   styleUrls: ['./player.component.css']
// })
// export class PlayerComponent {
//   username: string = '';
//   techStacks: TechStack[] = [];
//   selectedTechStack: TechStack | null = null;
//   questions: Question[] = [];
//   currentQuestionIndex: number = 0;
//   playerAnswers: string[] = [];
//   quizCompleted: boolean = false;

//   constructor(private router: Router, private playerService: PlayerService) {}

//   checkDuplicateUsername(): boolean {
//     // Check if the username already exists
//     // Implement your logic to check for duplicate username using the player service
//     // Return true if the username already exists, false otherwise
//   }

//   setUsername() {
//     if (this.username.trim() === '') {
//       alert('Please enter a username.');
//       return;
//     }

//     if (this.checkDuplicateUsername()) {
//       alert('Username already exists. Please enter a different username.');
//       return;
//     }

//     // Save the username using the player service
//     // Implement your logic to save the username

//     this.loadTechStacks();
//   }

//   loadTechStacks() {
//     this.playerService.getTechStacks().subscribe((techStacks: TechStack[]) => {
//       this.techStacks = techStacks;
//     });
//   }

//   selectTechStack(techStack: TechStack) {
//     this.selectedTechStack = techStack;
//     this.loadQuestionsByTechStack(techStack.id);
//   }

//   loadQuestionsByTechStack(techStackId: number) {
//     this.playerService.getQuestionsByTechStack(techStackId).subscribe((questions: Question[]) => {
//       this.questions = questions;
//     });
//   }

//   answerQuestion(answer: string) {
//     this.playerAnswers[this.currentQuestionIndex] = answer;
//     this.currentQuestionIndex++;

//     if (this.currentQuestionIndex === this.questions.length) {
//       this.quizCompleted = true;
//       // Implement your logic to calculate the player's rank
//       // Save the player's score and completion time using the player service
//     }
//   }

//   goToHome() {
//     this.router.navigate(['/home']);
//   }
// }

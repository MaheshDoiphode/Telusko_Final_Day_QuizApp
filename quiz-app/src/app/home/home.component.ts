import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { trigger, state, style, animate, transition } from '@angular/animations';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
  animations: [
    trigger('fadeInOut', [
      transition(':enter', [
        style({ opacity: 0 }),
        animate('500ms', style({ opacity: 1 }))
      ]),
      transition(':leave', [
        animate('500ms', style({ opacity: 0 }))
      ])
    ]),
    trigger('buttonAnimation', [
      state('void', style({ transform: 'translateY(-20px)', opacity: 0 })),
      transition(':enter', [
        animate('500ms ease-out')
      ])
    ])
  ]
})
export class HomeComponent {

  dialogRef: any;

  constructor(private userService: UserService, private  router: Router ) {}

    // // tslint:disable-next-line: typedef
    // public openRegister() {
    // this.dialogRef = this.dialog.open(RegisterComponent, {
    //   width: '420px'
    // });

  ngOnInit(): void {
  }

  adminUsername = '';
  userUsername = '';
 

  adminLogin(adminUsername: string) {
    if(adminUsername==="admin") {
      window.location.replace("/questions");
    } else {
      alert('Please enter correct username')
    }
  }
  userLogin(userUsername: string | any[]) {
    console.log(userUsername.length)
    if(userUsername.length < 2) {
      alert('Please enter correct username')
    } else {
      this.userService.saveUsername(userUsername);
       window.location.replace(`/historique/${userUsername}`);
    }
  }

  goToAdmin() {
    this.router.navigate(['/admin']);
  }

  goToPlayer() {
    this.router.navigate(['/player']);
  }


}
function ngOnInit() {
  throw new Error('Function not implemented.');
}


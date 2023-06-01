  import { NgModule } from '@angular/core';
  import { RouterModule, Routes } from '@angular/router';
  import { HomeComponent } from './home/home.component';
  import { AdminComponent } from './admin/admin.component';
  // import { PlayerComponent } from './player/player.component';

  const routes: Routes =  [
    { path: '', component: HomeComponent },
    { path: 'admin', component: AdminComponent },
    {path: 'home', component: HomeComponent}
    // { path: 'player', component: PlayerComponent },
  ];

  @NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })
  export class AppRoutingModule { }

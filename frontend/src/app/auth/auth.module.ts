import { NgModule } from '@angular/core';

import { AuthRoutingModule } from './auth-routing.module';
import { LoginComponent } from './login/login.component';
import { AuthComponent } from './auth.component';
import { MatToolbarModule } from "@angular/material/toolbar";
import { ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { CommonModule } from '@angular/common';
import { SharedmoduleModule } from '../sharedmodule/sharedmodule.module';




@NgModule({
  declarations: [
    LoginComponent,
     AuthComponent,
        
      
  ],
  imports: [
    AuthRoutingModule,
    MatToolbarModule,
    ReactiveFormsModule,
     CommonModule,
     SharedmoduleModule
]
})
export class AuthModule { }

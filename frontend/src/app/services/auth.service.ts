import { Injectable } from '@angular/core';
import { AuthRequst } from '../model/AuthRequest';
import { Observable } from 'rxjs';
import { Token } from '@angular/compiler';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor() {

   }
   setUsername(username: String): void{
       console.log(username);
   }

   getUsername(){
         
    return localStorage.getItem('username');

   }
   setToken(token: string){
          localStorage.setItem('token',token)
   }
   getToken(): string | null{
     return localStorage.getItem('token');
   }
   logout(){
         localStorage.removeItem('token')
   }
   isLoggedIn(){
    return this.getToken() != null;
   }
   login(request: AuthRequst){
    console.log(request.username)
    console.log(request.password)
   }
}

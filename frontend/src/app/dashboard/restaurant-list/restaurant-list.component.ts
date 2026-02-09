import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { RESTAURANTS } from 'src/db/retaurants';
@Component({
  selector: 'app-restaurant-list',
  templateUrl: './restaurant-list.component.html',
  styleUrls: ['./restaurant-list.component.scss']
})
export class RestaurantListComponent implements OnInit{
  
  restaurants :any = [];
  constructor(private http: HttpClient){

  }

ngOnInit(): void {

  this.http.get('http://localhost:8081/restaurants')
     .subscribe({
      next:data => this.restaurants = data
    
    });

}

}

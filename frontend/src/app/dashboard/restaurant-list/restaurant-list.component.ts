import { Component } from '@angular/core';
import { RESTAURANTS } from 'src/db/retaurants';
@Component({
  selector: 'app-restaurant-list',
  templateUrl: './restaurant-list.component.html',
  styleUrls: ['./restaurant-list.component.scss']
})
export class RestaurantListComponent {
   restaurants  = RESTAURANTS;
}

import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Restaurant } from 'src/app/model/Restaurant';

@Component({
  selector: 'app-restaurent-menu',
  templateUrl: './restaurent-menu.component.html',
  styleUrls: ['./restaurent-menu.component.scss']
})
export class RestaurentMenuComponent implements OnInit {
    rest$?: Observable<Restaurant | null>;

    constructor(){

    }
    ngOnInit(): void {
        
    }
}

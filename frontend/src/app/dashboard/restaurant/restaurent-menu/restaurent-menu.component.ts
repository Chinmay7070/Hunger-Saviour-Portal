import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { map, Observable } from 'rxjs';
import { Restaurant } from 'src/app/model/Restaurant';

@Component({
  selector: 'app-restaurent-menu',
  templateUrl: './restaurent-menu.component.html',
  styleUrls: ['./restaurent-menu.component.scss']
})
export class RestaurentMenuComponent implements OnInit {
    rest$?: Observable<Restaurant | null>;

    constructor(private route: ActivatedRoute){

    } 
   ngOnInit(): void {
  this.rest$ = this.route.data.pipe(
    map(data => data['rest'])
  );
}
}

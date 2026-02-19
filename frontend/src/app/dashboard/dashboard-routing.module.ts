import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { RestaurantListComponent } from './restaurant-list/restaurant-list.component';
import { RestaurentMenuComponent } from './restaurant/restaurent-menu/restaurent-menu.component';
import { restaurantResolver } from './restaurant/restaurant.resolver';

const routes: Routes = [
  {
    path : '',
    component : DashboardComponent,
    children: [
      {
        path: 'restaurants',
        component: RestaurantListComponent
      },
      {
        path: 'restaurants/:restaurantId',
        component: RestaurentMenuComponent,
        resolve:{
          rest: restaurantResolver
        }
      }
    
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DashboardRoutingModule { }

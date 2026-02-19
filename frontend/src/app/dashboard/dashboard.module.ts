import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DashboardRoutingModule } from './dashboard-routing.module';
import { DashboardComponent } from './dashboard/dashboard.component';
import { SharedmoduleModule } from '../sharedmodule/sharedmodule.module';
import { RestaurantListComponent } from './restaurant-list/restaurant-list.component';
import { RestaurantComponent } from './restaurant/restaurant.component';
import { HttpClientModule } from '@angular/common/http';
import { RestaurentMenuComponent } from './restaurant/restaurent-menu/restaurent-menu.component';


@NgModule({
  declarations: [
    DashboardComponent,
    RestaurantListComponent,
    RestaurantComponent,
    RestaurentMenuComponent
  ],
  imports: [
    CommonModule,
    DashboardRoutingModule,
    SharedmoduleModule,
    HttpClientModule
  ]
})
export class DashboardModule { }

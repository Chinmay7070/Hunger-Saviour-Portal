import { HttpClient } from '@angular/common/http';
import { inject } from '@angular/core';
import { ResolveFn } from '@angular/router';
import { Observable } from 'rxjs';

export const restaurantResolver: ResolveFn<Observable<any>> = (route, state) => {
  return inject(HttpClient)
        .get("http://localhost:8081/restaurants/"+Number(route.paramMap.get('restaurantId')));
};

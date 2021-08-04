import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
const baseUrl = 'http://localhost:8081/orders';

@Injectable({
  providedIn: 'root'
})
export class OrderService {
  constructor(private http: HttpClient) { }

 //Post order data
 placeOrder(order: any): Observable<any> {
  return this.http.post(baseUrl + '/order', order)
  
  }
}
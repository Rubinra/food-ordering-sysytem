import { Component, OnInit } from '@angular/core';
import { RouterLink } from '@angular/router';
import { Order } from '../model/order.model';
import { OrderService } from '../services/order.service';

@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.css']
})
export class OrdersComponent implements OnInit {
  order: Order = new Order();

  constructor(private Connect: OrderService) { }

  ngOnInit(): void {
  }
 
  save() {
    this.Connect.placeOrder(this.order)
      .subscribe(
        data => {
          console.log(data);
        },
        error => console.log(error));
    this.order = new Order();
  }
  onSubmit() {
    this.save();
    
  }

}

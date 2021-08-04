import { Component, OnInit } from '@angular/core';
import { ProductlistComponent } from '../components/productlist/productlist.component';
import { Order } from '../model/order.model';
import { OrderService } from '../services/order.service';

@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.css']
})
export class OrdersComponent implements OnInit {
  order: Order = new Order();
  submitted = false;

  constructor(private Connect: OrderService) { }

  ngOnInit(): void {
  }
  newOrder(): void {
    this.submitted = false;
    this.order = new Order();
  }
  save() {
    this.Connect.placeOrder(this.order)
      .subscribe(
        data => {
          console.log(data);
          this.submitted = true;
        },
        error => console.log(error));
    this.order = new Order();
  }
  onSubmit() {
    this.save();
    
  }

}

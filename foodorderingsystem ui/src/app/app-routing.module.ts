import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductlistComponent } from './components/productlist/productlist.component';
import { OrdersComponent } from './orders/orders.component';

const routes: Routes =
 [
  { path: '', redirectTo: 'posts', pathMatch: 'full' },
  { path: 'products', component: ProductlistComponent },
  { path: 'orders', component: OrdersComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { flattenDiagnosticMessageText } from 'typescript';
import { Products } from '../model/product.model';
import { LoginService } from '../services/login.service';
import { ProductserviceService } from '../services/productservice.service';
import { User } from '../model/user.model';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  users?: User[];
  products?: Products[];
  productForm: boolean = true;
  userForm: boolean = true;
  addProduct: boolean = true;

  constructor(private productService: ProductserviceService, private route: ActivatedRoute, private loginService: LoginService) { }

  ngOnInit(): void {
    this.getUsers();
    this.getProducts();
    this.productForm = false;
    this.userForm = true;
    this.addProduct = false;
  }
  //fetch product Details
  getProducts(): void {
    this.productService.getProducts()
      .subscribe(
        data => {
          this.products = data;
        },
        error => {
          console.error(error);
        });

  }
  editUser() {
    this.userForm = false;
    this.productForm = true;
  }
  editProduct() {
    this.userForm = true;
    this.productForm = false;
  }
  //fetch Users Data
  getUsers(): void {
    this.loginService.getAllUsers()
      .subscribe(
        data => {
          this.users = data;
        },
        error => {
          console.error(error);
        });

  }
  newProduct(){
    this.addProduct = true;
  }
  closeForm(){
    this.ngOnInit();
  }

}


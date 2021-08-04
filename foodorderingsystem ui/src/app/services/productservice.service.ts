import { Injectable } from '@angular/core';
import{HttpClient} from '@angular/common/http';
import{Observable} from 'rxjs';


const baseUrl = 'http://localhost:8081/products';

@Injectable({
  providedIn: 'root'
})

export class ProductserviceService {

constructor(private http: HttpClient) { }

getProducts(): Observable<any> {
  return this.http.get(baseUrl+"/listproducts");
}

}

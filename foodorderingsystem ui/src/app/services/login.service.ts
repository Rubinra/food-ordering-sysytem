import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
const baseUrl = 'http://localhost:8081/loginUser';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) { }
   //Get All Users
   getAllUsers(): Observable<any[]> {
    return this.http.get<any>(baseUrl+"/listUsers");
  }
}

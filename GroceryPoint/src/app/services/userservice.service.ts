import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Userentity } from 'src/app/entity/userentity';

@Injectable({
  providedIn: 'root'
})
export class UserserviceService {

  private baseUrl=""
  constructor(private http:HttpClient) { 

  }
  adduser(user:Userentity){
  return this.http.post(this.baseUrl,user,{ responseType:'text' as 'json'})
  }
}


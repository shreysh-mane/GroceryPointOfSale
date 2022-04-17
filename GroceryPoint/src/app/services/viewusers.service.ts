import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ViewusersService {

  constructor( private http:HttpClient) { }
  async details(){
    return await this.http.get("");
  }
}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Staffentity } from './staffentity';

@Injectable({
  providedIn: 'root'
})
export class StaffServiceService {

  private baseUrl="http://localhost:10013/grocery/addstaff"
  constructor(private http:HttpClient) { }


  addStaffs(staff:Staffentity){
    return this.http.post(this.baseUrl,staff,{responseType:'text' as 'json' })

  }

  // dealeradd(dealer:Dealerentity){
  //   return this.http.post(this.baseUrl,dealer,{responseType:'text' as 'json'});

}

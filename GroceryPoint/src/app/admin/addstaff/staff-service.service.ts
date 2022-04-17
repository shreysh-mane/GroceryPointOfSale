import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Staffentity } from './staffentity';

@Injectable({
  providedIn: 'root'
})
export class StaffServiceService {

  private baseUrl="http://localhost:9000/grocery/api/staff/addstaff"
  constructor(private http:HttpClient) { }


  addStaffs(staff:Staffentity){
    return this.http.post(this.baseUrl,staff,{responseType:'text' as 'json' })

  }

 
}

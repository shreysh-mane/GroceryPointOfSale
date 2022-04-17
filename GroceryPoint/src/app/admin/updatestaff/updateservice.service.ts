import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Updateentity } from './updateentity';

@Injectable({
  providedIn: 'root'
})
export class UpdateserviceService {

  private baseUrl="http://localhost:9000/grocery/api/staff/updateStaff";
  constructor(private http:HttpClient) { }

  updatestaff(update:Updateentity,email:any){
    return this.http.put(`${this.baseUrl}/${email}`,update,{responseType:'text' as 'json'});
  }

}

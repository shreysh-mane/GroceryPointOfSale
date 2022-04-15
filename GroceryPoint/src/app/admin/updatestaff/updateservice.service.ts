import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Updateentity } from './updateentity';

@Injectable({
  providedIn: 'root'
})
export class UpdateserviceService {

  private baseUrl="http://localhost:10013/grocery/updateStaff";
  constructor(private http:HttpClient) { }

  updatestaff(update:Updateentity,email:any){
    return this.http.put(`${this.baseUrl}/${email}`,update,{responseType:'text' as 'json'});
  }

}

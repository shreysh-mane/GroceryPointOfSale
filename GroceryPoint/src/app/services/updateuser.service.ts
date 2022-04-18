import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Userentity } from '../entity/userentity';

@Injectable({
  providedIn: 'root'
})
export class UpdateuserService {
private baseUrl="http://localhost:9000/grocery/api/customer/updatecustomers"
  constructor(private upd:HttpClient) {

   }
   updatestaff(update:Userentity,phnum:any){
    return this.upd.put(`${this.baseUrl}/${phnum}`,update,{responseType:'text' as 'json'});
  }
   }


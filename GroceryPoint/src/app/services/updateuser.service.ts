import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Userentity } from '../entity/userentity';

@Injectable({
  providedIn: 'root'
})
export class UpdateuserService {
private baseUrl=""
  constructor(private upd:HttpClient) {

   }
   updatestaff(update:Userentity,phnum:any){
    return this.upd.put(`${this.baseUrl}/${phnum}`,update,{responseType:'text' as 'json'});
  }
   }


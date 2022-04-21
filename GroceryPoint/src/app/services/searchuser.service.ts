import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Userentity } from '../entity/userentity';

@Injectable({
  providedIn: 'root'
})
export class SearchuserService {
user=new Userentity();

  private baseUrl="http://localhost:9000/grocery/api/customer/searchcustomers"
  constructor(private http:HttpClient) { 

  }
  searchuser(phnum:string){
    console.log(phnum);
  return this.http.get("http://localhost:9000/grocery/api/customer/searchcustomers/"+phnum,{responseType:'text'})
  
  }
}
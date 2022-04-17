import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Userentity } from '../entity/userentity';

@Injectable({
  providedIn: 'root'
})
export class SearchuserService {

  private baseUrl="http://localhost:9004/api/grocery/customer/searchcustomers"
  constructor(private http:HttpClient) { 

  }
  searchuser(search:Userentity){
  return this.http.post(this.baseUrl,search,{ responseType:'text' as 'json'})
  }
}
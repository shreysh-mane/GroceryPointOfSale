import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ShowserviceService {
  

  constructor(private http:HttpClient) { }

  async showStaff(){
    return await this.http.get("http://localhost:10013/grocery/showStaff");
  }
  public deleteStaff(email:string){
    return this.http.delete("http://localhost:10013/grocery/staffdelete/"+email)
  }
  
  
}

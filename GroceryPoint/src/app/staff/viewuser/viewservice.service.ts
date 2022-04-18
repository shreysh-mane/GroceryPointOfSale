import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ViewserviceService {

  constructor(private view:HttpClient) {

   }
   async showusers(){

    return await this.view.get("http://localhost:9004/api/grocery/customer/viewcustomers");
  }
  public deleteuser(phnum:number){
    return this.view.delete("http://localhost:9004/api/grocery/customer/deletecustomers/"+phnum)
  }
}



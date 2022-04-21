import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ViewserviceService {

  constructor(private view:HttpClient) {

   }
   async showusers(){

    return await this.view.get("http://localhost:9000/grocery/api/customer/viewcustomers");
  }
  public deleteuser(phnum:number){
    return this.view.delete("http://localhost:9000/grocery/api/customer/deletecustomers/"+phnum)
  }
}



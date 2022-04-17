import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ViewserviceService {

  constructor(private view:HttpClient) {

   }
   async showusers(){

    return await this.view.get("");
  }
  public deleteuser(phnum:number){
    return this.view.delete(""+phnum)
  }
}



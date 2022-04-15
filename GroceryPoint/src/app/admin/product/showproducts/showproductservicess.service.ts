import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ShowproductservicessService {

  constructor(private http:HttpClient) { }

  async showproduct(){
    return await this.http.get("http://localhost:10015/products/show")
  }
  public deleteproduct(ids:number){
    return this.http.delete("http://localhost:10015/products/delete/"+ids);
  }

 
}

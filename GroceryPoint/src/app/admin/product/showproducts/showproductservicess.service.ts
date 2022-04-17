import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ShowproductservicessService {

  constructor(private http:HttpClient) { }

  async showproduct(){
    return await this.http.get("http://localhost:9000/grocery/api/product/show")
  }
  public deleteproduct(ids:number){
    return this.http.delete("http://localhost:9000/grocery/api/product/delete/"+ids);
  }

 
}

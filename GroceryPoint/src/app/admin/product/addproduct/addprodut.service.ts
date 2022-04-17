import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Produtentity } from './produtentity';

@Injectable({
  providedIn: 'root'
})
export class AddprodutService {

  private baseUrl="http://localhost:9000/grocery/api/product/add";
  constructor(private http:HttpClient) { }


  addProduct(prd:Produtentity){
    return this.http.post(this.baseUrl,prd,{responseType:'text' as 'json'})

  }
}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Updateentity } from './updateentity';

@Injectable({
  providedIn: 'root'
})
export class UpdateserviceService {

  private url="http://localhost:9000/grocery/api/product/update";
  constructor(private http:HttpClient) { }

  updateprd(edit:Updateentity,ids:any){
    return this.http.put(`${this.url}/${ids}`,edit,{responseType:'text' as 'json'});
  }


}

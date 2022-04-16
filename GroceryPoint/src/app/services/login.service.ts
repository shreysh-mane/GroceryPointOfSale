import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
// import { EcommerceUser } from './ecommerce-user';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private baseUrl="http://localhost:9003/grocery/api/login";
  

  constructor(private _http : HttpClient) { }

  loginUserFromRemote(user:any)
  {
    return  this._http.post(this.baseUrl,user,{responseType:'text' as 'json'});
  }
}

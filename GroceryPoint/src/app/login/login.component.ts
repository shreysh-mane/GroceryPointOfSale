import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { LoginService } from '../services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private _service:LoginService,private route:Router) { }

  ngOnInit(): void {
  }
  public user={
    email:'',
    state:'',
    mobile:'',
    account:'',
    addhar :'',
    role :'',
  }

  loginUser(){

  var result=this._service.loginUserFromRemote(this.user);

  result.subscribe((data:any)=>{
    console.log(data)
    localStorage.setItem("staffemail",this.user.email);

    if(data.toString()=="admin")
    {
      this.route.navigate(['./admin']);
    }
    else if(data.toString()=="faild"){
        Swal.fire("login failed","wrong Password","error");
    }
    else
    {
      this.route.navigate(['./home']);
    }
  },(error)=>{
    Swal.fire("login failed","something went wrong","error");
  });
}
}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { LoginService } from '../services/login.service';
@Component({
  selector: 'app-forgetpass',
  templateUrl: './forgetpass.component.html',
  styleUrls: ['./forgetpass.component.css']
})
export class ForgetpassComponent implements OnInit {

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

  forgetPassUser(){

    var result=this._service.forgetPasswordSercive(this.user);

    result.subscribe((data:any)=>{
      console.log(data);

      if(data.toString()=="sent")
    {
      Swal.fire("Message sent","Password sent to email","success");
    }
    else
    {
      Swal.fire("failed","No user registered","error");
    }
    },(error)=>{
      Swal.fire("failed","something went wrong","error");
    });
  }


}

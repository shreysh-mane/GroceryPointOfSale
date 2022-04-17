import { Component, OnInit } from '@angular/core';
import { Userentity } from 'src/app/entity/userentity';
import { UserserviceService } from 'src/app/services/userservice.service';

@Component({
  selector: 'app-adduser',
  templateUrl: './adduser.component.html',
  styleUrls: ['./adduser.component.css']
})
export class AdduserComponent implements OnInit {
User =new Userentity(); 
  constructor(private user:UserserviceService) { }

  ngOnInit(): void {

  }
  addcustomer(){
    var resut=this.user.adduser(this.User);
    resut.subscribe(data=>console.log(data));
  }

}

import { Component, OnInit } from '@angular/core';
import { StaffServiceService } from './staff-service.service';
import { Staffentity } from './staffentity';

@Component({
  selector: 'app-addstaff',
  templateUrl: './addstaff.component.html',
  styleUrls: ['./addstaff.component.css']
})
export class AddstaffComponent implements OnInit {
 
  Staff=new Staffentity();
  constructor(private sss:StaffServiceService) { }

  ngOnInit(): void {
  }

  staffAdd(){
    var res=this.sss.addStaffs(this.Staff);
    res.subscribe(data=>alert(data));
    

  }

}

import { Component, OnInit } from '@angular/core';
import { ShowserviceService } from './showservice.service';

@Component({
  selector: 'app-showstaff',
  templateUrl: './showstaff.component.html',
  styleUrls: ['./showstaff.component.css']
})
export class ShowstaffComponent implements OnInit {

  Staffent:any=[];

  constructor(private ss:ShowserviceService) { }

  public deleteSTAFF(email:string){
    let res= this.ss.deleteStaff(email);
    res.subscribe((dd=>this.Staffent=dd));
    }
  ngOnInit(): void {
    this.StaffDetails();
    
  }

  StaffDetails(){
    var result=this.ss.showStaff().then(response=>response.toPromise());
    result.then(dd=>this.Staffent=dd);

  }
  
}

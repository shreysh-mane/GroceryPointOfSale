import { Component, OnInit } from '@angular/core';
import { Updateentity } from './updateentity';
import { UpdateserviceService } from './updateservice.service';

@Component({
  selector: 'app-updatestaff',
  templateUrl: './updatestaff.component.html',
  styleUrls: ['./updatestaff.component.css']
})
export class UpdatestaffComponent implements OnInit {

  update=new Updateentity();
  constructor(private sss:UpdateserviceService) { }

  ngOnInit(): void {
  }
  editstaff(){
    var result=this.sss.updatestaff(this.update,this.update.email);
    result.subscribe((data:any)=>alert(data));
  }

}

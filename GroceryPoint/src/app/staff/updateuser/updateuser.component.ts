import { Component, OnInit } from '@angular/core';
import { Userentity } from 'src/app/entity/userentity';
import { UpdateuserService } from 'src/app/services/updateuser.service';

@Component({
  selector: 'app-updateuser',
  templateUrl: './updateuser.component.html',
  styleUrls: ['./updateuser.component.css']
})
export class UpdateuserComponent implements OnInit {
  update=new Userentity();
  constructor(private sss:UpdateuserService) { }

  ngOnInit(): void {
  }
  updateuser(){
    var result=this.sss.updatestaff(this.update,this.update.phnum);
    result.subscribe((data:any)=>alert(data));
  }
}

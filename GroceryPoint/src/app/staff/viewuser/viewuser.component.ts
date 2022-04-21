import { Component, OnInit } from '@angular/core';
import { ViewserviceService } from './viewservice.service';

@Component({
  selector: 'app-viewuser',
  templateUrl: './viewuser.component.html',
  styleUrls: ['./viewuser.component.css']
})
export class ViewuserComponent implements OnInit {
  vuser:any=[]
  constructor(private ss:ViewserviceService) { }

  ngOnInit(): void {
this.showscustomers()

  }
showscustomers(){
  var result=this.ss.showusers().then(response=>response.toPromise());
  result.then(dd=>this.vuser=dd);

}
public delete(phnum:number){
  let result=this.ss.deleteuser(phnum);
  result.subscribe((data=>this.vuser=data))

}
}

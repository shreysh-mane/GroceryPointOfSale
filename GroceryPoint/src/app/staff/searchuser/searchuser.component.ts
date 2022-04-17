import { Component, OnInit } from '@angular/core';
import { Userentity } from 'src/app/entity/userentity';
import { SearchuserService } from 'src/app/services/searchuser.service';

@Component({
  selector: 'app-searchuser',
  templateUrl: './searchuser.component.html',
  styleUrls: ['./searchuser.component.css']
})
export class SearchuserComponent implements OnInit {
  users:any=[];
  public user:Userentity;
  constructor(private show:SearchuserService) {
    this.user=new Userentity();

   }

  ngOnInit(): void {
    this.searchusers()
  }
  searchusers(){
    var result=this.show.searchuser(this.user)
    result.subscribe((data:any)=>console.log(data));
     // Swal.fire("Good Job","Address Updated","success");

  }
}



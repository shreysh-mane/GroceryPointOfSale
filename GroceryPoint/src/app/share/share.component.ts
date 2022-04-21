import { ThrowStmt } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { Userentity } from '../entity/userentity';
import { SearchuserService } from '../services/searchuser.service';

@Component({
  selector: 'app-share',
  templateUrl: './share.component.html',
  styleUrls: ['./share.component.css']
})
export class ShareComponent implements OnInit {

  users:any=[];
  public user:Userentity;
  constructor(private show:SearchuserService) {
    this.user=new Userentity();

   }

  ngOnInit(): void {
    this.searchusers(this.users.phnum);
  }
  searchusers(phnum:string){
    //console.log(parseInt(phnum));
    var ph=parseInt(phnum);
    console.log(ph);

    if(!isNaN(Number(ph))){
      var ph = Number(ph);
    } else{
        console.log('Not a Number');
    }


    var result=this.show.searchuser(phnum);
    result.subscribe((data)=>alert(data +"      customer exist"));
     // Swal.fire("Good Job","Address Updated","success");

  }

}

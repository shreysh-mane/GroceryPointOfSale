import { Component, OnInit } from '@angular/core';
import { Updateentity } from '../updateentity';
import { UpdateserviceService } from '../updateservice.service';

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})
export class UpdateProductComponent implements OnInit {

  edit=new Updateentity();
  constructor(private ss:UpdateserviceService) { }

  ngOnInit(): void {
  }

  editProduct(){
    var result=this.ss.updateprd(this.edit,this.edit.ids);
    result.subscribe((data:any)=>alert(data));
  }
}

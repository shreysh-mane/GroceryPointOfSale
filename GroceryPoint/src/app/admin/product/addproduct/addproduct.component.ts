import { Component, OnInit } from '@angular/core';
import { AddprodutService } from './addprodut.service';
import { Produtentity } from './produtentity';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {

  product=new Produtentity();
  constructor( private ser:AddprodutService) { }

  ngOnInit(): void {
  }
  productAdd(){
    var result=this.ser.addProduct(this.product);
    result.subscribe(data=>alert(data));
  }

}

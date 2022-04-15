import { Component, OnInit } from '@angular/core';

import { ShowproductservicessService } from './showproductservicess.service';

@Component({
  selector: 'app-showproducts',
  templateUrl: './showproducts.component.html',
  styleUrls: ['./showproducts.component.css']
})
export class ShowproductsComponent implements OnInit {

  products:any=[];
  constructor(private sss:ShowproductservicessService) { }

  public deleteprd(ids:number){
    let resps=this.sss.deleteproduct(ids);
    resps.subscribe((dd=>this.products=dd));
  }
  ngOnInit(): void {
    this.productShow();
    
  }
  productShow(){
    var result=this.sss.showproduct().then(response=>response.toPromise());
    result.then(dd=>this.products=dd);
  }
  
}

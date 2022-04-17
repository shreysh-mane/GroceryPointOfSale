import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddstaffComponent } from './admin/addstaff/addstaff.component';
import { AddproductComponent } from './admin/product/addproduct/addproduct.component';
import { ShowproductsComponent } from './admin/product/showproducts/showproducts.component';
import { UpdateProductComponent } from './admin/product/update-product/update-product.component';
import { ShowstaffComponent } from './admin/showstaff/showstaff.component';

import { UpdatestaffComponent } from './admin/updatestaff/updatestaff.component';
import { ForgetpassComponent } from './forgetpass/forgetpass.component';
import { HeadComponent } from './home/head/head.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {path:"",
  component:LoginComponent},
  {
  path:"forget",
  component:ForgetpassComponent
  },
  {path:"admin",
  component:HeadComponent},
  {path:"home",
  component:HeadComponent},
   {path:"addstaff", 
   component:AddstaffComponent
  },
  
  {
    path:"addproducts",
    component:AddproductComponent
  },
 
  {
    path:"viewStaff",
    component:ShowstaffComponent
  },
  {
    path:"productview",
    component:ShowproductsComponent
  },
  {
    path:"update",
    component:UpdateProductComponent
  },
  {
    path:"updates",
    component:UpdatestaffComponent
  }
  
  
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

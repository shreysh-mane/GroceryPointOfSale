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
import { ShareComponent } from './share/share.component';
import { AdduserComponent } from './staff/adduser/adduser.component';
//import { SearchuserComponent } from './staff/searchuser/searchuser.component';
import { UpdateuserComponent } from './staff/updateuser/updateuser.component';
import { ViewuserComponent } from './staff/viewuser/viewuser.component';

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
  },

  {
    path:"adduser",
    component:AdduserComponent
  },
  
  // {
  //   path:"searchuser",
  //   component:SearchuserComponent
  // },

  {
    path:"updateuser",
    component:UpdateuserComponent
  },

  {
    path:"viewuser",
    component:ViewuserComponent
  },

  { path:"share",component:ShareComponent},

  // {
  //   path:"deleteuser",
  //   component:DeleteuserComponent
  // }
  
  // {
  //   path:"share",component:ShareComponent,

  //   children: [
  //     {
  //       path:"searchuser",
  //       component:SearchuserComponent,
  //     },
  //     {
  //       path:"updateuser",
  //       component:UpdateuserComponent, // another child route component that the router renders
  //     },
  //   ],


  // },
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

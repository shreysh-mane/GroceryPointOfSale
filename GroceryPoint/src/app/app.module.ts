import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeadComponent } from './home/head/head.component';
import { LoginComponent } from './admin/login/login.component';
import { AdminHomeComponent } from './admin/admin-home/admin-home.component';
import { AddstaffComponent } from './admin/addstaff/addstaff.component';
import { FormsModule } from '@angular/forms';
import { UpdatestaffComponent } from './admin/updatestaff/updatestaff.component';
import { AddproductComponent } from './admin/product/addproduct/addproduct.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { StaffhomeComponent } from './staff/staffhome/staffhome.component';
import { ShowstaffComponent } from './admin/showstaff/showstaff.component';
import { ShowproductsComponent } from './admin/product/showproducts/showproducts.component';
import { UpdateProductComponent } from './admin/product/update-product/update-product.component';

@NgModule({
  declarations: [
    AppComponent,
    HeadComponent,
    LoginComponent,
    AdminHomeComponent,
    AddstaffComponent,
    UpdatestaffComponent,
    AddproductComponent,
    
    StaffhomeComponent,
    ShowstaffComponent,
    ShowproductsComponent,
    UpdateProductComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
 
   
    

  

   

    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

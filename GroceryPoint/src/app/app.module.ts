import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeadComponent } from './home/head/head.component';
import { LoginComponent } from './login/login.component';
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
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import { ForgetpassComponent } from './forgetpass/forgetpass.component';
import { AdduserComponent } from './staff/adduser/adduser.component';
import { UpdateuserComponent } from './staff/updateuser/updateuser.component';
import { ViewuserComponent } from './staff/viewuser/viewuser.component';
import { ShareComponent } from './share/share.component';


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
    ForgetpassComponent,
    AdduserComponent,
    UpdateuserComponent,
    ViewuserComponent,
    ShareComponent
  
 
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatInputModule,
    MatFormFieldModule
    
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

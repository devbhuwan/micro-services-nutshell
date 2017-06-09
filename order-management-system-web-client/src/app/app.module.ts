import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { routing }        from './app.routing';
import { FormsModule }   from '@angular/forms';
import { HttpModule } from '@angular/http';

import { PanelModule, InputTextModule, PasswordModule, ButtonModule } from 'primeng/primeng';
import { AuthenticationService } from './_services/index';
import { LoginComponent } from './login/index';
import { HomeComponent } from './home/index';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule, 
    FormsModule,
    HttpModule,
    routing,
    BrowserAnimationsModule,
    InputTextModule, PanelModule, PasswordModule, ButtonModule
  ],
  providers: [AuthenticationService],
  bootstrap: [AppComponent]
})
export class AppModule { }

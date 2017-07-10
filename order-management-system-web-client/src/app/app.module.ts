import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { NgModule } from '@angular/core'
import { StoreModule } from '@ngrx/store';

import { AppComponent } from './app.component';
import { routing }        from './app.routing';
import { FormsModule }   from '@angular/forms';
import { HttpModule } from '@angular/http';


import { PanelModule, InputTextModule, PasswordModule, ButtonModule } from 'primeng/primeng';
import { AuthenticationService } from './_services/index';
import { LoginComponent } from './login/index';
import { HomeComponent } from './home/index';
import { OrderComponent } from './order/order.component';
import { OperationComponent } from './operation/operation.component';
import { OperationButtonComponent } from './operation-button/operation-button.component';
import { OrderFormComponent } from './order-form/order-form.component';
import { createOrder } from './order/order.action.function'

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    OrderComponent,
    OperationComponent,
    OperationButtonComponent,
    OrderFormComponent
  ],
  imports: [
    BrowserModule, 
    StoreModule.provideStore({ counter: createOrder }),
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

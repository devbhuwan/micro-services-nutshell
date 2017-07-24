import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import { OrderRoutingModule } from './order-routing.module';
import { ViewComponent } from './view/view.component';
import { CoreModule } from '../core/core.module'

@NgModule({
  imports: [
    CommonModule,
    OrderRoutingModule,
    CoreModule.forRoot()
  ],
  declarations: [ViewComponent]
})
export class OrderModule { }

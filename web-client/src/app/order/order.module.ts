import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {OrderRoutingModule} from './order-routing.module';
import {CoreModule} from '../core/core.module';
import {OrderSectionComponent} from './order-section/order-section.component'

export const COMPONENTS = [
  //ViewComponent
];

@NgModule({
  imports: [
    CommonModule,
    OrderRoutingModule,
    CoreModule.forRoot(),
  ],
  declarations: [OrderSectionComponent],
  providers: []
})
export class OrderModule {
}

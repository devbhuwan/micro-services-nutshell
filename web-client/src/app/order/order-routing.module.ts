import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

import {OrderSectionComponent} from './order-section/order-section.component';

const routes: Routes = [
  {
    path: '',
    component: OrderSectionComponent,
    data: {
      title: 'Order View'
    }
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class OrderRoutingModule {
}

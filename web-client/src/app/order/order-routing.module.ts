import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {OrderPageComponent} from "./order-page/order-page.component";
import {OrderFormComponent} from "./order-form/order-form.component";

const routes: Routes = [
  {
    path: '',
    component: OrderPageComponent,
    data: {title: 'Order View'}
  },
  {
    path: 'form',
    component: OrderFormComponent,
    data: {title: 'Order Form'}
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class OrderRoutingModule {

}

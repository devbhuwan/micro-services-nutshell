import {RouterModule, Routes} from "@angular/router";

import {LoginComponent} from "./login/index";
import {HomeComponent} from "./home/index";
import {OrderComponent} from "./order/order.component";

const appRoutes: Routes = [
  {path: '', component: LoginComponent},
  {path: 'home', component: HomeComponent},
  {path: 'order', component: OrderComponent},
  // otherwise redirect to home
  {path: '**', redirectTo: ''}
];

export const routing = RouterModule.forRoot(appRoutes);

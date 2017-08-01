import {ModuleWithProviders, NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {EffectsModule} from "@ngrx/effects";
import {StoreModule} from "@ngrx/store";
import {OrderPageComponent} from './order-page/order-page.component';
import {OrderRoutingModule} from "./order-routing.module";
import {OrderFormComponent} from './order-form/order-form.component';
import {WorkflowModule} from "../workflow/workflow.module";
import {CoreModule} from "../core/core.module";
import {OrderListComponent} from './order-list/order-list.component';
import {OrderService} from "./shared/services/order.service";
import {HotTableModule} from "ng2-handsontable";
import {ReactiveFormsModule} from "@angular/forms";
import {OrderEffects} from "./shared/effects/order";

export const COMPONENTS = [OrderPageComponent, OrderFormComponent, OrderListComponent];
export const PROVIDERS = [OrderService];
export const EFFECTS = [OrderEffects];

@NgModule({
  imports: [
    CommonModule,
    HotTableModule,
    ReactiveFormsModule,
    OrderRoutingModule,
    CoreModule.forRoot(),
    WorkflowModule.forRoot()
  ],
  declarations: COMPONENTS,
  exports: COMPONENTS
})
export class OrderModule {

  static forRoot(): ModuleWithProviders {
    return {
      ngModule: RootOrderModule,
      providers: PROVIDERS,
    };
  }

}

@NgModule({
  imports: [
    OrderModule,
    StoreModule.forFeature('order', {}),
    EffectsModule.forFeature(EFFECTS),
  ],
})
export class RootOrderModule {
}

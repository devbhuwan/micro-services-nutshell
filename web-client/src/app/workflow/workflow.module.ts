import {ModuleWithProviders, NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {CoreModule, RootCoreModule} from "../core/core.module";
import {StoreModule} from "@ngrx/store";
import {EffectsModule} from "@ngrx/effects";

export const COMPONENTS = [];
export const PROVIDERS = [];
export const EFFECTS = [];

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: COMPONENTS,
  exports: COMPONENTS
})
export class WorkflowModule {

  static forRoot(): ModuleWithProviders {
    return {
      ngModule: RootWorkflowModule,
      providers: PROVIDERS,
    };
  }

}

@NgModule({
  imports: [
    CoreModule,
    StoreModule.forFeature('workflow', {}),
    EffectsModule.forFeature(EFFECTS),
  ],
})
export class RootWorkflowModule {

}

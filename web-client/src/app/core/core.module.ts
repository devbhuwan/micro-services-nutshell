import {ModuleWithProviders, NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {EffectsModule} from "@ngrx/effects";
import {StoreModule} from "@ngrx/store";

export const COMPONENTS = [];

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: COMPONENTS,
  exports: COMPONENTS
})
export class CoreModule {

  static forRoot(): ModuleWithProviders {
    return {
      ngModule: RootCoreModule,
      providers: [],
    };
  }

}

@NgModule({
  imports: [
    CoreModule,
    StoreModule.forFeature('core', {}),
    EffectsModule.forFeature([]),
  ],
})
export class RootCoreModule {
}

import {ModuleWithProviders, NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {UiDateComponent} from './ui-date/ui-date.component';
import {StoreModule} from "@ngrx/store";
import {EffectsModule} from "@ngrx/effects";

export const COMPONENTS = [UiDateComponent];
export const PROVIDERS = [];
export const EFFECTS = [];

@NgModule({
  imports: [
    CommonModule,
    StoreModule.forFeature('core', {}),
    EffectsModule.forFeature(EFFECTS)
  ],
  declarations: COMPONENTS,
  exports: COMPONENTS
})
export class CoreModule {

  static forRoot(): ModuleWithProviders {
    return {
      ngModule: CoreModule,
      providers: PROVIDERS,
    };
  }

}

import {ModuleWithProviders, NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {UiDateComponent} from './ui-date/ui-date.component';
import {StoreModule} from "@ngrx/store";
import {EffectsModule} from "@ngrx/effects";

@NgModule({
  imports: [
    CommonModule,
    StoreModule.forFeature('core', {}),
    EffectsModule.forFeature([])
  ],
  declarations: [UiDateComponent],
  exports: [UiDateComponent]
})
export class CoreModule {

  static forRoot(): ModuleWithProviders {
    return {
      ngModule: CoreModule,
      providers: [],
    };
  }

}

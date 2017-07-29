import {ModuleWithProviders, NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {UiDateComponent} from './ui-date/ui-date.component';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [UiDateComponent],
  exports: [UiDateComponent]
})
export class CoreUiModule {

  static forRoot(): ModuleWithProviders {
    return {
      ngModule: CoreUiModule,
      providers: [],
    };
  }

}

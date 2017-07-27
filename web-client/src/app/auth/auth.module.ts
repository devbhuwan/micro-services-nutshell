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
export class AuthModule {

  static forRoot(): ModuleWithProviders {
    return {
      ngModule: RootAuthModule,
      providers: [],
    };
  }

}

@NgModule({
  imports: [
    AuthModule,
    StoreModule.forFeature('auth', {}),
    EffectsModule.forFeature([]),
  ],
})
export class RootAuthModule {
}

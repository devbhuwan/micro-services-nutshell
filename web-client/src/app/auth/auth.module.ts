import {ModuleWithProviders, NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {EffectsModule} from "@ngrx/effects";
import {StoreModule} from "@ngrx/store";
import {LoginPageComponent} from "./login-page/login-page.component";
import {RouterModule} from "@angular/router";
import {AuthGuard} from "./services/auth-guard";
import {AuthService} from "./services/auth-service";
import {ReactiveFormsModule} from "@angular/forms";
import {AuthEffects} from "./effects/auth.effects";
import {reducers} from "./reducers/index";

export const COMPONENTS = [LoginPageComponent];

@NgModule({
  imports: [
    CommonModule, ReactiveFormsModule,
  ],
  declarations: COMPONENTS,
  exports: COMPONENTS
})
export class AuthModule {

  static forRoot(): ModuleWithProviders {
    return {
      ngModule: RootAuthModule,
      providers: [AuthService, AuthGuard],
    };
  }
}

@NgModule({
  imports: [
    AuthModule,
    RouterModule.forChild([{path: 'login', component: LoginPageComponent}]),
    StoreModule.forFeature('auth', reducers),
    EffectsModule.forFeature([AuthEffects]),
  ],
})
export class RootAuthModule {
}

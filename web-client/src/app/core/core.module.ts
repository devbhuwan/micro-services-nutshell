import {ModuleWithProviders, NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {WorkflowComponent} from './workflow/workflow.component';
import {StoreModule} from "@ngrx/store";
import {WorkflowService} from './services/workflow.service';
import {EffectsModule} from "@ngrx/effects";
import {WorkflowEffects} from "./effects/workflow.effects";
import {workflowReducer} from "./reducers/workflow.reducers";

@NgModule({
  imports: [
    CommonModule,
    StoreModule.forRoot({workflowReducer}),
    EffectsModule.forRoot([WorkflowEffects])
  ],
  declarations: [WorkflowComponent],
  exports: [WorkflowComponent],
  providers: [WorkflowService]
})
export class CoreModule {

  static forRoot(): ModuleWithProviders {
    return {
      ngModule: CoreModule,
      providers: []
    };
  }

}

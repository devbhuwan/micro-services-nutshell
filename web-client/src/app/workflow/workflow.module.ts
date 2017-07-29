import {ModuleWithProviders, NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {StoreModule} from "@ngrx/store";
import {EffectsModule} from "@ngrx/effects";
import {reducers} from "./reducers/index";
import {WorkflowEffects} from "./effects/workflow.effects";
import {WorkflowService} from "./services/workflow-service";
import {WorkflowSectionComponent} from "./workflow-section/workflow-section.component";

export const COMPONENTS = [WorkflowSectionComponent];
export const PROVIDERS = [WorkflowService];
export const EFFECTS = [WorkflowEffects];

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
    WorkflowModule,
    StoreModule.forFeature('appWorkflow', reducers),
    EffectsModule.forFeature(EFFECTS),
  ],
})
export class RootWorkflowModule {

}

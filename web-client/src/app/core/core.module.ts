import { NgModule, ModuleWithProviders } from '@angular/core';
import { CommonModule } from '@angular/common';
import { WorkflowComponent } from './workflow/workflow.component';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [WorkflowComponent],
  exports: [WorkflowComponent],
  providers: []
})
export class CoreModule {

  static forRoot() : ModuleWithProviders {
    return {
      ngModule: CoreModule,
      providers: []
    };
  }

}

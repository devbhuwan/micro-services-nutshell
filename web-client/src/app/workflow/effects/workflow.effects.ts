import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/do';
import 'rxjs/add/operator/exhaustMap';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/take';
import {Injectable} from '@angular/core';
import {Router} from '@angular/router';
import {Actions, Effect} from '@ngrx/effects';
import {of} from 'rxjs/observable/of';

import {WorkflowService} from '../services/workflow-service';
import * as Workflow from '../actions/workflow';

@Injectable()
export class WorkflowEffects {

  @Effect()
  executeOperation$ = this.actions$
    .ofType(Workflow.EXECUTE_OPERATION)
    .map((action: Workflow.ExecuteOperation) => action.payload)
    .exhaustMap(operation =>
      this.workflowService
        .executeOperation(operation)
        .map(operationExecutionResult => new Workflow.ExecuteOperationSuccess({operationExecutionResult}))
        .catch(error => of(new Workflow.ExecuteOperationFailure(error)))
    );

  @Effect({dispatch: false})
  executeOperationSuccess$ = this.actions$
    .ofType(Workflow.EXECUTE_OPERATION_SUCCESS)
    .do(() => this.router.navigate(['/']));

  constructor(private actions$: Actions,
              private workflowService: WorkflowService,
              private router: Router) {
  }

}

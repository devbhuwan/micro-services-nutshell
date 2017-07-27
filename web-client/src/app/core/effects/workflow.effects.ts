import {Injectable} from "@angular/core";
import {Actions, Effect, toPayload} from "@ngrx/effects";
import {Observable} from "rxjs/Observable";
import {Action} from "@ngrx/store";
import * as workflow from "../actions/workflow.actions"
import {empty} from "rxjs/observable/empty";
import {WorkflowService} from "../services/workflow.service";
import {of} from "rxjs/observable/of";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/switchMap';
import 'rxjs/add/operator/debounceTime';
import 'rxjs/add/operator/skip';
import 'rxjs/add/operator/takeUntil';

@Injectable()
export class WorkflowEffects {


  @Effect()
  loadOperation$: Observable<Action> = this.actions$
    .ofType(workflow.LOAD_OPERATION)
    .map(toPayload)
    .switchMap(query => {
      if (query === '') {
        return empty();
      }
      return this.workflowService.loadOperations(query)
        .map(operations => {
          return new workflow.LoadOperationCompleteAction(operations)
        })
        .catch(() => of(new workflow.LoadOperationCompleteAction([])));
    });

  @Effect()
  executeOperation$: Observable<Action> = this.actions$
    .ofType(workflow.EXECUTE_OPERATION)
    .map(toPayload)
    .switchMap(query => {
      if (query === '') {
        return empty();
      }
      return this.workflowService.executeOperation(query)
        .map(executionResults => {
          return new workflow.ExecuteOperationCompleteAction(executionResults)
        })
        .catch(() => of(new workflow.ExecuteOperationCompleteAction([])));
    });

  constructor(private actions$: Actions, private workflowService: WorkflowService) {
  }
}

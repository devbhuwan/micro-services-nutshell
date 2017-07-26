import {Action} from '@ngrx/store';
import {Operation} from "../models/operation";
import {ExecutionResult} from "../models/execution-result";

export const LOAD_OPERATION = '[Operation] Load';
export const LOAD_OPERATION_COMPLETE = '[Operation] Load Complete';
export const EXECUTE_OPERATION = '[Operation] Execute Operation';
export const EXECUTE_OPERATION_COMPLETE = '[Operation] Execute Operation Complete';

export class LoadOperation implements Action {
  readonly type = LOAD_OPERATION;

  constructor(public payload: Operation[]) {
    console.log("LoadOperation<#>operations: " + payload.length);
  }
}

export class LoadOperationCompleteAction implements Action {
  readonly type = LOAD_OPERATION_COMPLETE;

  constructor(public payload: Operation[]) {
    console.log("LoadOperationCompleteAction<#>operations: " + payload.length);
  }
}

export class ExecuteOperation implements Action {
  readonly type = EXECUTE_OPERATION;

  constructor(public payload: Operation) {

  }

}

export class ExecuteOperationCompleteAction implements Action {
  readonly type = EXECUTE_OPERATION_COMPLETE;

  constructor(public payload: ExecutionResult[]) {
    console.log("ExecuteOperationCompleteAction<#>exec result: " + payload);
  }
}

export type Actions
  = LoadOperation
  | LoadOperationCompleteAction
  | ExecuteOperation
  | ExecuteOperationCompleteAction;

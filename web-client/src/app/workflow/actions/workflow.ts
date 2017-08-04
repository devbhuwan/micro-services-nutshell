import {Action} from '@ngrx/store';
import {ExecuteOperationParameter, Operation, OperationExecutionResult} from '../models/workflow';

export const EXECUTE_OPERATION = '[Operation] Execute';
export const EXECUTE_OPERATION_SUCCESS = '[Operation] Execute Success';
export const EXECUTE_OPERATION_FAILURE = '[Operation] Execute Failure';

export class ExecuteOperation implements Action {
  readonly type = EXECUTE_OPERATION;

  constructor(public payload: ExecuteOperationParameter) {
  }
}

export class ExecuteOperationSuccess implements Action {
  readonly type = EXECUTE_OPERATION_SUCCESS;

  constructor(public payload: { operationExecutionResult: OperationExecutionResult }) {
  }
}

export class ExecuteOperationFailure implements Action {
  readonly type = EXECUTE_OPERATION_FAILURE;

  constructor(public payload: any) {
  }
}

export type Actions =
  | ExecuteOperation
  | ExecuteOperationSuccess
  | ExecuteOperationFailure;

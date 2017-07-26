import {Action} from "@ngrx/store";
import {Operation} from "../../core/models/operation";

export const LOAD_ORDER_WORKFLOW_OPERATION = "[Operation] Load Order Workflow Operation";
export const LOAD_ORDER_WORKFLOW_OPERATION_COMPLETE = "[Operation] Load Order Workflow Operation COMPLETE";

export class LoadOrderWorkflowOperation implements Action {

  readonly type = LOAD_ORDER_WORKFLOW_OPERATION;

  constructor(public payload: any) {
    console.log("LoadOrderWorkflowOperation<$> { payload=" + payload + " }");
  }

}

export class LoadOrderWorkflowOperationComplete implements Action {

  readonly type = LOAD_ORDER_WORKFLOW_OPERATION_COMPLETE;

  constructor(public payload: Operation[]) {
    console.log("LoadOrderWorkflowOperationComplete<$> { payload=" + payload.length + " }");
  }

}


export type Actions
  = LoadOrderWorkflowOperation
  | LoadOrderWorkflowOperationComplete;

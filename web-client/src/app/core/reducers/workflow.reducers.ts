import {Operation} from "../models/operation";
import * as workflow from "../actions/workflow.actions";
import {createSelector} from "@ngrx/store";

export interface WorkflowState {
  operations: Operation[];
  selectedOperation: Operation | null;
}

export const initialState: WorkflowState = {
  operations: [],
  selectedOperation: null
};

export function reducer(state = initialState, action: workflow.Actions): WorkflowState {
  switch (action.type) {
    case workflow.LOAD_OPERATION: {
      console.log("WorkflowReducers<#>Load Operation>>>" + JSON.stringify(action.payload));
      return {
        operations: action.payload,
        selectedOperation: state.selectedOperation
      }
    }
    case workflow.LOAD_OPERATION_COMPLETE: {
      console.log("WorkflowReducers<#>Load Operation Complete>>>" + JSON.stringify(action.payload));
      return {
        operations: action.payload,
        selectedOperation: state.selectedOperation
      }
    }
    case workflow.EXECUTE_OPERATION: {
      console.log("WorkflowReducers<#>Execute Operation>>>>");
      return {
        operations: state.operations,
        selectedOperation: action.payload
      };
    }
    default: {
      console.log("WorkflowReducers<#>Default>>>>");
      return state;
    }
  }
}

export const getWorkflowState = (state: WorkflowState) => state;

export const getOperations = createSelector(getWorkflowState, state => {
  console.log("WorkflowReducers<#>getOperations()->" + JSON.stringify(state));
  return state.operations
});

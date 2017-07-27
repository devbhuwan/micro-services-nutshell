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

export function workflowReducer(state = initialState, action: workflow.Actions): WorkflowState {
  switch (action.type) {
    case workflow.LOAD_OPERATION: {
      return {
        operations: action.payload,
        selectedOperation: state.selectedOperation
      }
    }
    case workflow.LOAD_OPERATION_COMPLETE: {
      state.operations = action.payload;
      return Object.assign({}, state, {logging: true, error: null})
    }
    case workflow.EXECUTE_OPERATION: {
      return {
        operations: state.operations,
        selectedOperation: action.payload
      };
    }
    default: {
      return state;
    }
  }
}

export const getWorkflowState = (state: WorkflowState) => state;
export const getOperations = createSelector(getWorkflowState, state => state.operations);

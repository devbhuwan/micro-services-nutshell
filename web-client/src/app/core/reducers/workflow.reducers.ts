import {Operation} from "../models/operation";
import * as workflow from "../actions/workflow.actions";
import {combineReducers, createSelector} from "@ngrx/store";
import {compose} from "@ngrx/core";

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
      state.operations = action.payload
      console.log("" + JSON.stringify(state));
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

export const rootReducers = {
  workflowReducer
};

export const rootReducer = compose(combineReducers)(rootReducers);

export function reducer(state, action) {
  return rootReducer(state, action);
}


export const getWorkflowState = (state: WorkflowState) => state;
export const getOperations = createSelector(getWorkflowState, state => state.operations);

import * as workflow from '../actions/workflow';
import {Operation} from '../models/workflow';

export interface State {
  operations: Operation[];
  selectedOperation: Operation | null;
}

export const initialState: State = {
  operations: [],
  selectedOperation: null,
};

export function reducer(state = initialState, action: workflow.Actions): State {
  switch (action.type) {
    default: {
      return state;
    }
  }
}

export const getOperations = (state: State) => state.operations;
export const getSelectedOperation = (state: State) => state.selectedOperation;

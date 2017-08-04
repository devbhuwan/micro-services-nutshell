import {createFeatureSelector, createSelector} from '@ngrx/store';
import * as fromRoot from '../../reducers';
import * as fromWorkflow from './workflow';

export interface WorkflowState {
  status: fromWorkflow.State;
}

export interface State extends fromRoot.State {
  workflow: WorkflowState;
}

export const reducers = {
  workflow: fromWorkflow.reducer,
};

export const selectWorkflowState = createFeatureSelector<WorkflowState>('workflow');

export const selectWorkflowStatusState = createSelector(
  selectWorkflowState, (state: WorkflowState) => state.status
);

export const getSelectedOperation = createSelector(
  selectWorkflowStatusState, fromWorkflow.getSelectedOperation
);

export const getOperations = createSelector(selectWorkflowStatusState, fromWorkflow.getOperations);

export const getExecuteOperationParameter = createSelector(selectWorkflowStatusState, fromWorkflow.getExecuteOperationParameter);

import { ActionReducer, Action } from '@ngrx/store';

export const CREATE_ORDER = 'CREATE_ORDER';
export const CANCEL = 'CANCEL';
export const RESET = 'RESET';

export function createOrder(state: string = RESET, action: Action) {
	switch (action.type) {
		case CREATE_ORDER:
			alert("action.type")
			return "CREATED";			
		case CANCEL:
			return RESET;

		default:
			return state;
	}
}
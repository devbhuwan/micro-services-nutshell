import { Action } from '@ngrx/store';
import { Order } from '../models/order';

export const ADD_BOOK = '[Collection] Add Order';
export const ADD_BOOK_SUCCESS = '[Collection] Add Order Success';
export const ADD_BOOK_FAIL = '[Collection] Add Order Fail';
export const REMOVE_BOOK = '[Collection] Remove Order';
export const REMOVE_BOOK_SUCCESS = '[Collection] Remove Order Success';
export const REMOVE_BOOK_FAIL = '[Collection] Remove Order Fail';
export const LOAD = '[Collection] Load';
export const LOAD_SUCCESS = '[Collection] Load Success';
export const LOAD_FAIL = '[Collection] Load Fail';

/**
 * Add Order to Collection Actions
 */
export class AddOrderAction implements Action {
  readonly type = ADD_BOOK;

  constructor(public payload: Order) {}
}

export class AddOrderSuccessAction implements Action {
  readonly type = ADD_BOOK_SUCCESS;

  constructor(public payload: Order) {}
}

export class AddOrderFailAction implements Action {
  readonly type = ADD_BOOK_FAIL;

  constructor(public payload: Order) {}
}

/**
 * Remove Order from Collection Actions
 */
export class RemoveOrderAction implements Action {
  readonly type = REMOVE_BOOK;

  constructor(public payload: Order) {}
}

export class RemoveOrderSuccessAction implements Action {
  readonly type = REMOVE_BOOK_SUCCESS;

  constructor(public payload: Order) {}
}

export class RemoveOrderFailAction implements Action {
  readonly type = REMOVE_BOOK_FAIL;

  constructor(public payload: Order) {}
}

/**
 * Load Collection Actions
 */
export class LoadAction implements Action {
  readonly type = LOAD;
}

export class LoadSuccessAction implements Action {
  readonly type = LOAD_SUCCESS;

  constructor(public payload: Order[]) {}
}

export class LoadFailAction implements Action {
  readonly type = LOAD_FAIL;

  constructor(public payload: any) {}
}

export type Actions =
  | AddOrderAction
  | AddOrderSuccessAction
  | AddOrderFailAction
  | RemoveOrderAction
  | RemoveOrderSuccessAction
  | RemoveOrderFailAction
  | LoadAction
  | LoadSuccessAction
  | LoadFailAction;

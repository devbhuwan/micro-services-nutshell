import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/switchMap';
import 'rxjs/add/operator/debounceTime';
import 'rxjs/add/operator/skip';
import 'rxjs/add/operator/takeUntil';
import {Injectable} from '@angular/core';
import {Actions} from '@ngrx/effects';

import {OrderService} from "./order.service";

@Injectable()
export class WorkflowEffects {

  constructor(private actions$: Actions, private orderService: OrderService) {

  }

  //
  // @Effect()
  // loadOperations$: Observable<Action> = this.actions$
  //   .ofType(order.LOAD_ORDER_WORKFLOW_OPERATION)
  //   .debounceTime(300)
  //   .map(toPayload)
  //   .switchMap()
}

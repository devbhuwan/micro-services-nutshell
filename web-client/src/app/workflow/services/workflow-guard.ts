import 'rxjs/add/operator/take';
import 'rxjs/add/operator/map';
import {Injectable} from '@angular/core';
import {CanActivate} from '@angular/router';
import {Store} from '@ngrx/store';
import {Observable} from 'rxjs/Observable';
import * as fromWorkflow from '../reducers/index';

@Injectable()
export class WorkflowGuard implements CanActivate {

  constructor(private store: Store<fromWorkflow.State>) {
  }

  canActivate(): Observable<boolean> {
    return;
  }
}

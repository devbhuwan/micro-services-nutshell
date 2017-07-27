import {Component, OnInit} from '@angular/core';
import {Operation} from "../models/operation";
import {Store} from "@ngrx/store";
import * as workflow from "../reducers/workflow.reducers";
import {WorkflowState} from "../reducers/workflow.reducers";
import {EXECUTE_OPERATION, LOAD_OPERATION, LOAD_OPERATION_COMPLETE} from "../actions/workflow.actions"
import {Observable} from "rxjs/Observable";

@Component({
  selector: 'oms-workflow',
  templateUrl: './workflow.component.html',
  styleUrls: ['./workflow.component.scss']
})
export class WorkflowComponent implements OnInit {

  operations$: Observable<Operation[]>;

  constructor(private store: Store<WorkflowState>) {
  }

  ngOnInit() {
    this.store.dispatch({type: LOAD_OPERATION});
    this.operations$ = this.store.select(workflow.getOperations);
    this.operations$.subscribe(a => {
      console.log("Observer...." + JSON.stringify(a));
    });
  }

  executeOperation(operation: Operation) {
    this.store.dispatch({type: EXECUTE_OPERATION});
  }

}

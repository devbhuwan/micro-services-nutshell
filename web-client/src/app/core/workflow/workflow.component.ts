import {Component, OnInit} from '@angular/core';
import {Operation} from "../models/operation";
import {Store} from "@ngrx/store";
import * as workflow from "../reducers/workflow.reducers";
import {WorkflowState} from "../reducers/workflow.reducers";
import {EXECUTE_OPERATION, LOAD_OPERATION} from "../actions/workflow.actions"
import {Observable} from "rxjs/Observable";

@Component({
  selector: 'oms-workflow',
  templateUrl: './workflow.component.html',
  styleUrls: ['./workflow.component.scss']
})
export class WorkflowComponent implements OnInit {

  operations$: Observable<Operation[]>;
  operations: Operation[];

  constructor(private store: Store<WorkflowState>) {
    this.operations$ = this.store.select(workflow.getOperations);
  }

  ngOnInit() {
    this.store.dispatch({type: LOAD_OPERATION});
    this.operations$.subscribe(operations => {
      console.log("WorkflowComponent<#>operations=> " + JSON.stringify(operations));
      this.operations = operations;
    });
  }

  executeOperation(operation: Operation) {
    this.store.dispatch({type: EXECUTE_OPERATION});
  }

}

import {Component, OnInit} from '@angular/core';
import {Operation} from "../models/operation";
import {Store} from "@ngrx/store";
import {WorkflowState} from "../reducers/workflow.reducers";
import * as workflowActions from "../actions/workflow.actions"
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
    this.operations$ = this.store.select('operations');
    this.operations$.subscribe((ops: Operation[]) => {
      console.log("Operations :" + JSON.stringify(ops));
      this.operations = ops;
    });
  }

  ngOnInit() {
  }

  loadOperation() {
    this.store.dispatch(new workflowActions.LoadOperation([]));
  }

  executeOperation(operation: Operation) {

  }

}

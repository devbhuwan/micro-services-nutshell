import {Component, OnInit} from '@angular/core';
import * as fromWorkflow from '../reducers/index';
import {Store} from "@ngrx/store";
import {WorkflowService} from "../services/workflow-service";
import {Observable} from "rxjs/Observable";
import {Operation} from "../models/workflow";
import * as WorkflowActions from '../actions/workflow';

@Component({
  selector: 'oms-workflow-section',
  templateUrl: './workflow-section.component.html',
  styleUrls: ['./workflow-section.component.scss']
})
export class WorkflowSectionComponent implements OnInit {

  operations$: Observable<Operation[]>;


  constructor(private store: Store<fromWorkflow.State>, private workflowService: WorkflowService) {
  }

  ngOnInit() {
    this.operations$ = this.workflowService.loadOperations();
  }

  clickOperation($event: Operation) {
    console.log("Click Operation : " + JSON.stringify($event));
    this.store.dispatch(new WorkflowActions.ExecuteOperation($event));
  }

}

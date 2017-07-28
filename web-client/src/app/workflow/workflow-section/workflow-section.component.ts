import {Component, OnInit} from '@angular/core';
import * as fromWorkflow from '../reducers/index';
import {Store} from "@ngrx/store";

@Component({
  selector: 'oms-workflow-section',
  templateUrl: './workflow-section.component.html',
  styleUrls: ['./workflow-section.component.scss']
})
export class WorkflowSectionComponent implements OnInit {

  operations$ = this.store.select(fromWorkflow.getOperations);

  constructor(private store: Store<fromWorkflow.State>) {
  }

  ngOnInit() {
  }

}

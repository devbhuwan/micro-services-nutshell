import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'oms-workflow',
  templateUrl: './workflow.component.html',
  styleUrls: ['./workflow.component.scss']
})
export class WorkflowComponent implements OnInit {

  constructor() {
    console.log("WorkflowComponent#new....")
  }

  ngOnInit() {
  }

}

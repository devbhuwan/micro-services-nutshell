import { Component, OnInit } from '@angular/core';
import { Operation } from './../_models/operation';

@Component({
  selector: 'app-operation',
  templateUrl: './operation.component.html',
  styleUrls: ['./operation.component.css']
})
export class OperationComponent implements OnInit {

  operations: Array<Operation> = [{label: "Ok Click Me", actionCode: 'CREATE_ORDER'},{label: "Cancel", actionCode: 'CANCEL'}];

  constructor() { }

  ngOnInit() {
    
  }

}

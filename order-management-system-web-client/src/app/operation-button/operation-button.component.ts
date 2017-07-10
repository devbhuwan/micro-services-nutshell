import { Component, OnInit, Input } from '@angular/core';
import { Store } from '@ngrx/store';
import {Observable} from 'rxjs/Observable'
import { Operation } from '../_models/operation'
import { Order } from '../_models/order'

@Component({
  selector: 'app-operation-button',
  templateUrl: './operation-button.component.html',
  styleUrls: ['./operation-button.component.css']
})
export class OperationButtonComponent implements OnInit {

  @Input()
  operation: Operation
  state: Observable<string>;

  constructor(private store: Store<Order>) { 
    this.state = store.select('state');  
  }

  ngOnInit() {
  }

  fireAction() {
    alert(this.operation.actionCode)
    this.store.dispatch({type: this.operation.actionCode})
  }


}

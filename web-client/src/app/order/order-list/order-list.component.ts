import {Component, OnInit} from '@angular/core';
import {Observable} from "rxjs/Observable";
import {Order} from "../shared/models/order";

@Component({
  selector: 'oms-order-list',
  templateUrl: './order-list.component.html',
  styleUrls: ['./order-list.component.scss']
})
export class OrderListComponent implements OnInit {

  orders$: Observable<Order[]>;

  constructor() {

  }

  ngOnInit() {

  }

}

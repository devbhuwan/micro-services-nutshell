import {Component, EventEmitter, OnInit} from '@angular/core';
import {Observable} from "rxjs/Observable";
import {Order} from "../shared/models/order";
import {getFinanceData} from "./data";
import {OrderService} from "../shared/services/order.service";

@Component({
  selector: 'oms-order-list',
  templateUrl: './order-list.component.html',
  styleUrls: ['./order-list.component.scss']
})
export class OrderListComponent implements OnInit {

  orders$: Observable<Order[]>;
  eventHandler: EventEmitter<{}>;
  private data: any[];
  private colHeaders: string[];
  private columns: any[];
  private options: any;

  constructor() {
    this.data = getFinanceData();
    this.colHeaders = ['ORDER ID', 'ORDER DATE', 'CUSTOMER NAME', 'CUSTOMER DESCRIPTION', 'ORDER STATE', 'ACTIONS'];
    this.columns = [
      {type: 'numeric'},
      {type: 'date', dateFormat: 'DD/MM/YYYY', correctFormat: true},
      {type: 'text'},
      {type: 'text'},
      {type: 'text'},
      {type: 'text'}
    ];
    this.options = {
      height: 396,
      rowHeaders: true,
      stretchH: 'all',
      columnSorting: true,
      contextMenu: true
    };
  }

  ngOnInit() {

  }

}

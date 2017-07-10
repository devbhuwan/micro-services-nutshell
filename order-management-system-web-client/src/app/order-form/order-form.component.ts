import { Component, OnInit } from '@angular/core';
import { Order } from '../_models/order'

@Component({
  selector: 'app-order-form',
  templateUrl: './order-form.component.html',
  styleUrls: ['./order-form.component.css']
})
export class OrderFormComponent implements OnInit {

  order: Order;

  constructor() {
    
   }

  ngOnInit() {
  }

}

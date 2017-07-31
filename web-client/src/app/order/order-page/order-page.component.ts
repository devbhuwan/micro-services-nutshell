import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'oms-order-page',
  templateUrl: './order-page.component.html',
  styleUrls: ['./order-page.component.scss']
})
export class OrderPageComponent implements OnInit {

  constructor(private router: Router) {
  }

  ngOnInit() {
  }

  createNewOrderButton() {
    this.router.navigate(['/order/form']);
  }

}

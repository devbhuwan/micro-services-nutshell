import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'oms-order-form',
  templateUrl: './order-form.component.html',
  styleUrls: ['./order-form.component.scss']
})
export class OrderFormComponent implements OnInit {

  form: FormGroup = new FormGroup({
    description: new FormControl(''),
  });

  constructor() {
  }

  ngOnInit() {
  }

  clickSubmit() {
    console.log("clickSubmit() => " + JSON.stringify(this.form.value));
  }

}

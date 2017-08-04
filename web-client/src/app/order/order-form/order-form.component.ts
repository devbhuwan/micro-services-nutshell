import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {Order} from "../shared/models/order";
import * as workflowActions from "../../workflow/actions/workflow";
import * as fromWorkflow from '../../workflow/reducers/index';
import {Store} from "@ngrx/store";

@Component({
  selector: 'oms-order-form',
  templateUrl: './order-form.component.html',
  styleUrls: ['./order-form.component.scss']
})
export class OrderFormComponent implements OnInit {

  @Output() submitted = new EventEmitter<Order>();

  form: FormGroup = new FormGroup({
    description: new FormControl(''),
  });

  constructor(private store: Store<fromWorkflow.State>) {

  }

  ngOnInit() {
  }

  clickSubmit() {
    if (this.form.valid) {
      console.log("clickSubmit() => " + JSON.stringify(this.form.value));
      this.submitted.emit(this.form.value);
      this.store.dispatch(new workflowActions.ExecuteOperation({
        taskKey: "CREATE",
        processInstanceId: null,
        domainDto: this.form.value,
        domainKey: null
      }));
    }
  }

}

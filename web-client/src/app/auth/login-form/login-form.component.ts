import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Authenticate} from "app/auth/models/user";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'oms-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.scss']
})
export class LoginFormComponent implements OnInit {

  @Input() errorMessage: string | null;
  @Output() submitted = new EventEmitter<Authenticate>();
  form: FormGroup = new FormGroup({
    username: new FormControl(''),
    password: new FormControl(''),
  });

  constructor() {
  }

  @Input()
  set pending(isPending: boolean) {
    if (isPending) {
      this.form.disable();
    }

    this.form.enable();
  }

  ngOnInit() {
  }

  submit() {
    if (this.form.valid) {
      console.log("value=" + JSON.stringify(this.form.value));
      this.submitted.emit(this.form.value);
    }
  }
}

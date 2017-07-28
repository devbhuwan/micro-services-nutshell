import {Component, OnInit} from '@angular/core';
import {Authenticate} from "../models/user";
import * as fromAuth from "../reducers/index";
import {Store} from "@ngrx/store";
import * as Auth from "../actions/auth";

@Component({
  selector: 'oms-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.scss']
})
export class LoginPageComponent implements OnInit {

  pending$ = this.store.select(fromAuth.getLoginPagePending);
  error$ = this.store.select(fromAuth.getLoginPageError);

  constructor(private store: Store<fromAuth.State>) {
  }

  ngOnInit() {
  }

  onSubmit($event: Authenticate) {
    this.store.dispatch(new Auth.Login($event));
  }

}

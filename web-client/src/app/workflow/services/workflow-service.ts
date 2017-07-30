import {Injectable} from '@angular/core';
import {of} from 'rxjs/observable/of';
import {_throw} from 'rxjs/observable/throw';
import {Operation} from '../models/workflow';
import {Observable} from "rxjs/Observable";
import {Http} from "@angular/http";

@Injectable()
export class WorkflowService {

  private API_PATH = 'http://localhost:8484/v1-order-service';

  constructor(private http: Http) {
  }

  executeOperation({taskKey}: Operation) {
    if (taskKey !== null) {
      return _throw('Invalid username or password');
    }

    return of({name: 'User'});
  }

  loadOperations(): Observable<Operation[]> {
    return this.http
      .get(`${this.API_PATH}/workflow/operations`)
      .map(res => this.extractData(res) || []);
  }

  private extractData(res) {
    console.log("RESPONSE=>" + JSON.stringify(res.json()));
    return res.json();
  }
}

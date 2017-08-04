import {Injectable} from '@angular/core';
import {_throw} from 'rxjs/observable/throw';
import {ExecuteOperationParameter, Operation} from '../models/workflow';
import {Observable} from "rxjs/Observable";
import {Http} from "@angular/http";

@Injectable()
export class WorkflowService {

  private API_PATH = 'http://localhost:8484/v1-order-service';

  constructor(private http: Http) {
  }

  executeOperation(parameter: ExecuteOperationParameter) {
    if (parameter == null) {
      return _throw('Task key is null');
    }
    console.log("REQUEST-BODY=>" + JSON.stringify(parameter));
    this.http.post(`${this.API_PATH}/workflow/execute`, JSON.stringify(parameter))
      .map(res => this.extractData(res) || []);
  }

  loadOperations(): Observable<Operation[]> {
    return this.http
      .post(`${this.API_PATH}/workflow/operations`, JSON.stringify({"hello": "Yes"}))
      .map(res => this.extractData(res) || []);
  }

  private extractData(res) {
    console.log("RESPONSE=>" + JSON.stringify(res.json()));
    return res.json();
  }
}

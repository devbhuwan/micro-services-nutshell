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
    console.log("ExecuteOperation=>" + JSON.stringify(parameter));
    if (parameter == null) {
      return _throw('Task key is null');
    }
    let requestBody = {};
    console.log("REQUEST-BODY=>" + JSON.stringify(requestBody));
    this.http.post(`${this.API_PATH}/workflow/execute`, JSON.stringify(requestBody))
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

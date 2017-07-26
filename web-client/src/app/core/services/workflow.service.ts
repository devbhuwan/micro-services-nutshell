import {Injectable} from '@angular/core';
import {Observable} from "rxjs/Observable";
import {Operation} from "../models/operation";
import {Http} from "@angular/http";
import {ExecutionResult} from "../models/execution-result";

@Injectable()
export class WorkflowService {

  private API_PATH = 'http://localhost:8484/v1-order-service';

  constructor(private http: Http) {
  }

  loadOperations(query: any): Observable<Operation[]> {
    return this.http.get(`${this.API_PATH}/workflow/operations`)
      .map(res => {
        console.log("WorkflowService<#>loadOperation>res=>" + JSON.stringify(res.json()));
        return res.json() || []
      });
  }

  executeOperation(query: any): Observable<ExecutionResult[]> {
    return this.http.post(`${this.API_PATH}/workflow/execute`, query)
      .map(res => res.json().items || []);
  }

}

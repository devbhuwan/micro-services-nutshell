import {Injectable} from '@angular/core';
import {Http, Response} from "@angular/http";
import {Observable} from "rxjs/Observable";
import {Operation} from "../../core/models/operation";

@Injectable()
export class OrderService {

  private API_PATH = 'http://localhost:8484/v1-order-service';

  constructor(private http: Http) {
  }

  listOperations(searchQuery: any): Observable<Operation[]> {
    return this.http.get(this.API_PATH + '/workflow/operations')
      .map((response: Response) => {
        return response.json().items || [];
      });
  }

}

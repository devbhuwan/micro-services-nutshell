import {Injectable} from '@angular/core';
import {CoreService} from "../../../core/definations/abstract-service";
import {Order} from "../models/order";
import {Observable} from "rxjs/Observable";
import {Http} from "@angular/http";

@Injectable()
export class OrderService extends CoreService {

  private API_PATH = 'http://localhost:8484/v1-order-service';

  constructor(private http: Http) {
    super()
  }

  loadOrders(): Observable<Order[]> {
    return this.http.get(`${this.API_PATH}/order/all`)
      .map(res => this.extractData(res) || []);
  }

}

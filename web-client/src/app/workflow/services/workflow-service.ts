import {Injectable} from '@angular/core';
import {of} from 'rxjs/observable/of';
import {_throw} from 'rxjs/observable/throw';
import {Operation} from '../models/workflow';

@Injectable()
export class WorkflowService {
  constructor() {
  }

  executeOperation({taskKey}: Operation) {
    if (taskKey !== null) {
      return _throw('Invalid username or password');
    }

    return of({name: 'User'});
  }

  loadOperations(): Operation[] {
    return [];
  }
}

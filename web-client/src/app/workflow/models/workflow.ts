export interface Operation {
  taskKey: string;
  taskName: string;
  label: string;
}

export interface ExecuteOperationParameter {
  taskKey: string;
  domainDto: any;
  processInstanceId: string;
  domainKey: string;
}

export interface OperationExecutionResult {

}

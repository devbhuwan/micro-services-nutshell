package io.github.devbhuwan.microservices.nutshell.order.service.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class PrepareOrderServiceTask implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {

    }

}

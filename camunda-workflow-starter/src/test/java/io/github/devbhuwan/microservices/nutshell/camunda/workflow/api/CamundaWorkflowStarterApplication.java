package io.github.devbhuwan.microservices.nutshell.camunda.workflow.api;


import io.github.devbhuwan.microservices.nutshell.camunda.workflow.autoconfigure.CamundaWorkflowAutoConfiguration;
import io.github.devbhuwan.microservices.security.autoconfigure.MicroServiceSecurityAutoConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.camunda.bpm.spring.boot.starter.event.ProcessApplicationStartedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;
import org.springframework.util.Assert;

@SpringBootApplication
@ComponentScan(value = {
        MicroServiceSecurityAutoConfiguration.BASE_PACKAGE,
        CamundaWorkflowAutoConfiguration.BASE_PACKAGE
})
@Slf4j
public class CamundaWorkflowStarterApplication {

    public static final String WF_REQUEST_APPROVAL = "wf-request-approval";
    @Autowired
    private RepositoryService repositoryService;

    public static void main(String[] args) {
        SpringApplication.run(CamundaWorkflowStarterApplication.class, args);
    }

    @EventListener
    public void notify(final ProcessApplicationStartedEvent unused) {
        final ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().processDefinitionKey(WF_REQUEST_APPROVAL).singleResult();
        log.info("Found deployed process: {}", processDefinition);
        //Assert.notNull(processDefinition, "process '" + WF_REQUEST_APPROVAL + "' should be deployed!");
    }
}

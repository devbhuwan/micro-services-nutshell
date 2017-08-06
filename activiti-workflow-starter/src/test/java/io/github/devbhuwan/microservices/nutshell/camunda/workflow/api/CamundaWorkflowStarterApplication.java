package io.github.devbhuwan.microservices.nutshell.camunda.workflow.api;


import io.github.devbhuwan.microservices.nutshell.camunda.workflow.autoconfigure.CamundaWorkflowAutoConfiguration;
import io.github.devbhuwan.microservices.security.autoconfigure.MicroServiceSecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {
        MicroServiceSecurityAutoConfiguration.BASE_PACKAGE,
        CamundaWorkflowAutoConfiguration.BASE_PACKAGE
})
public class CamundaWorkflowStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CamundaWorkflowStarterApplication.class, args);
    }
}

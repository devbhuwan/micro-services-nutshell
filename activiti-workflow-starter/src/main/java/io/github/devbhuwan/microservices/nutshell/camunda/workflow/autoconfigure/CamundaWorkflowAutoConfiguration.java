package io.github.devbhuwan.microservices.nutshell.camunda.workflow.autoconfigure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@EnableConfigurationProperties(CamundaWorkflowProperties.class)
@Slf4j
public class CamundaWorkflowAutoConfiguration {
    public static final String BASE_PACKAGE = "io.github.devbhuwan.microservices.nutshell.camunda.workflow";
    @Autowired
    private CamundaWorkflowProperties camundaWorkflowProperties;

    @PostConstruct
    public void beforeConstruct() {
        log.info("START -> " + this.getClass().getName());
    }


}

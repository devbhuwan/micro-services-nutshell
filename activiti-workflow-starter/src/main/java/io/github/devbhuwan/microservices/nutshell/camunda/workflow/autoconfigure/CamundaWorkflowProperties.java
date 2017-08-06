package io.github.devbhuwan.microservices.nutshell.camunda.workflow.autoconfigure;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "devbhuwan.camunda.workflow")
@Validated
@Getter
@Setter
public class CamundaWorkflowProperties {

    private boolean enable = Boolean.TRUE;

}

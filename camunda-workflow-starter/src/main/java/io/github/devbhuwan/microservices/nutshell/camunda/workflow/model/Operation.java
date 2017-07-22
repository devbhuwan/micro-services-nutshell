package io.github.devbhuwan.microservices.nutshell.camunda.workflow.model;

import org.immutables.value.Value;

@Value.Immutable
public interface Operation {

    String taskKey();

    String label();

    String taskName();
}

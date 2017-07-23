package io.github.devbhuwan.microservices.nutshell.camunda.workflow.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(builder = ImmutableOperation.Builder.class)
public interface Operation {

    String taskKey();

    String label();

    String taskName();
}

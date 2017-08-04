package io.github.devbhuwan.microservices.nutshell.workflow.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.devbhuwan.microservices.nutshell.workflow.ImmutableOperation;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(builder = ImmutableOperation.Builder.class)
public interface Operation {

    String taskKey();

    String label();

    String taskName();
}

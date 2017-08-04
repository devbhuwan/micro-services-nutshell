package io.github.devbhuwan.microservices.nutshell.workflow.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import static io.github.devbhuwan.microservices.nutshell.workflow.model.ImmutableOperation.Builder;

@Value.Immutable
@JsonDeserialize(builder = Builder.class)
public interface Operation {

    String taskKey();

    String label();

    String taskName();
}

package io.github.devbhuwan.microservices.nutshell.order.commands;

import io.github.devbhuwan.microservices.nutshell.order.domain.Order;
import org.immutables.value.Value;


@Value.Immutable
public interface OrderCommand {

    Order order();

}

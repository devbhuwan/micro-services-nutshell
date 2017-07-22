package io.github.devbhuwan.microservices.nutshell.order.contracts;

import io.github.devbhuwan.microservices.nutshell.order.commands.OrderCommand;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/05/19
 */
public interface OrderCommandService {
    void add(OrderCommand orderCommand);

    void update(OrderCommand orderCommand);
}

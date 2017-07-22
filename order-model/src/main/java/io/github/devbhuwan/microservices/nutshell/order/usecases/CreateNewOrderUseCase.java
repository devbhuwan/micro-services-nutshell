package io.github.devbhuwan.microservices.nutshell.order.usecases;

import io.github.devbhuwan.microservices.nutshell.order.commands.ImmutableOrderCommand;
import io.github.devbhuwan.microservices.nutshell.order.contracts.OrderCommandService;
import io.github.devbhuwan.microservices.nutshell.order.domain.Order;
import io.github.devbhuwan.microservices.nutshell.order.domain.OrderState;
import lombok.Setter;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/05/19
 */
public class CreateNewOrderUseCase {

    @Setter
    private OrderCommandService orderCommandService;

    public void createNewOrder(Order order) {
        order.setState(OrderState.CREATED.name());
        orderCommandService.add(ImmutableOrderCommand
                .builder()
                .order(order).build());
    }
}

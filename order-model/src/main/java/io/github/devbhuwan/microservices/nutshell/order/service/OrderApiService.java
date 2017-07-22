package io.github.devbhuwan.microservices.nutshell.order.service;

import io.github.devbhuwan.microservices.nutshell.order.contracts.OrderQueryRepository;
import io.github.devbhuwan.microservices.nutshell.order.domain.Order;
import io.github.devbhuwan.microservices.nutshell.order.usecases.AcceptOrderUseCase;
import io.github.devbhuwan.microservices.nutshell.order.usecases.CreateNewOrderUseCase;
import io.github.devbhuwan.microservices.nutshell.order.usecases.DeliverOrderUseCase;
import io.github.devbhuwan.microservices.nutshell.order.usecases.RejectOrderUseCase;
import lombok.Setter;

import java.util.List;

public class OrderApiService {

    @Setter
    private OrderQueryRepository orderQueryRepository;
    @Setter
    private CreateNewOrderUseCase createNewOrderUseCase;
    @Setter
    private AcceptOrderUseCase acceptOrderUseCase;
    @Setter
    private DeliverOrderUseCase deliverOrderUseCase;
    @Setter
    private RejectOrderUseCase rejectOrderUseCase;

    public List<Order> orders() {
        return orderQueryRepository.findAll();
    }

    public void createOrder(Order order) {
        createNewOrderUseCase.createNewOrder(order);
    }

    public void acceptOrder(Order order) {
        acceptOrderUseCase.acceptOrder(order);
    }

    public void rejectOrder(Order order) {
        rejectOrderUseCase.rejectOrder(order);
    }

    public void deliverOrder(Order order) {
        deliverOrderUseCase.deliverOrder(order);
    }

}

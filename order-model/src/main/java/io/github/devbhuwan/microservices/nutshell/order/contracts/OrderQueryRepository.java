package io.github.devbhuwan.microservices.nutshell.order.contracts;

import io.github.devbhuwan.microservices.nutshell.order.domain.Order;

import java.util.List;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/05/19
 */
public interface OrderQueryRepository {
    List<Order> findAll();

    List<Order> findOthersByField(String field, Order order);
}

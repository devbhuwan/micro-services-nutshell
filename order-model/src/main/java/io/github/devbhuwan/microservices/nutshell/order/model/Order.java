package io.github.devbhuwan.microservices.nutshell.order.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/05/19
 */
@Getter
@Setter
public class Order {

    private String orderId;
    private String description;
    private LocalDate orderedDate;
    private String customerId;
    private List<OrderItem> orderItems;

}

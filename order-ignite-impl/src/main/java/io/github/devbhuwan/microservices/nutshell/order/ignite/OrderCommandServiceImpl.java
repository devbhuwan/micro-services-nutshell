package io.github.devbhuwan.microservices.nutshell.order.ignite;

import io.github.devbhuwan.microservices.nutshell.order.commands.OrderCommand;
import io.github.devbhuwan.microservices.nutshell.order.contracts.OrderCommandService;
import io.github.devbhuwan.microservices.nutshell.order.domain.Order;
import org.apache.ignite.Ignite;
import org.springframework.beans.factory.annotation.Autowired;

import static io.github.devbhuwan.microservices.nutshell.order.ignite.CacheHelper.generateUniqueKey;
import static io.github.devbhuwan.microservices.nutshell.order.ignite.CacheHelper.orderCache;
import static io.github.devbhuwan.microservices.util.EnsureUtil.ensureNotNull;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/05/19
 */
public class OrderCommandServiceImpl implements OrderCommandService {

    @Autowired
    private Ignite ignite;

    @Override
    public void add(OrderCommand orderCommand) {
        ensureNotNull("order", orderCommand.order());
        orderCommand.order().setOrderId(generateUniqueKey());
        orderCache(ignite).put(orderCommand.order().getOrderId(), orderCommand.order());
    }

    @Override
    public void update(OrderCommand orderCommand) {
        Order order = orderCache(ignite).get(orderCommand.order().getOrderId());
        ensureNotNull("order id", order);
        orderCache(ignite).put(order.getOrderId(), order);
    }

}

package io.github.devbhuwan.microservices.nutshell.order.ignite;


import io.github.devbhuwan.microservices.nutshell.order.contracts.OrderQueryRepository;
import io.github.devbhuwan.microservices.nutshell.order.domain.Order;
import org.apache.ignite.Ignite;
import org.apache.ignite.cache.query.SqlQuery;
import org.springframework.beans.factory.annotation.Autowired;

import javax.cache.Cache;
import java.util.List;
import java.util.stream.Collectors;

import static io.github.devbhuwan.microservices.nutshell.order.ignite.CacheHelper.orderCache;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/05/19
 */
public class OrderQueryRepositoryImpl implements OrderQueryRepository {

    @Autowired
    private Ignite ignite;

    @Override
    public List<Order> findAll() {
        return orderCache(ignite).query(new SqlQuery<String, Order>(Order.class, "from Order"))
                .getAll().stream().map(Cache.Entry::getValue).collect(Collectors.toList());
    }

    @Override
    public List<Order> findOthersByField(String field, Order order) {
        return null;
    }

}

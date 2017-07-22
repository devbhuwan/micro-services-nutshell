package io.github.devbhuwan.microservices.nutshell.order.ignite;

import io.github.devbhuwan.microservices.nutshell.order.domain.Order;
import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;

import java.util.UUID;

import static io.github.devbhuwan.microservices.util.EnsureUtil.ensureNotNull;

public class CacheHelper {

    public static IgniteCache<String, Order> orderCache(Ignite ignite) {
        ensureNotNull("ignite", ignite);
        return ignite.getOrCreateCache("orderCache");
    }

    public static String generateUniqueKey() {
        return UUID.randomUUID().toString();
    }

}

package io.github.devbhuwan.microservices.nutshell.order.service;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/06/09
 */
@Component
public class OrderServiceResource extends ResourceConfig {

    public OrderServiceResource() {
        register(RESTOrderCatalogService.class);
    }

}

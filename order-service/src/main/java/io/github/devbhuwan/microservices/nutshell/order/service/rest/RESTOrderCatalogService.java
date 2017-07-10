package io.github.devbhuwan.microservices.nutshell.order.service.rest;

import io.github.devbhuwan.microservices.nutshell.order.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/05/19
 */

@RestController
@RequestMapping("/order")
public class RESTOrderCatalogService {

    @GetMapping("/all")
    public List<Order> orders() {
        return Collections.singletonList(new Order());
    }
}

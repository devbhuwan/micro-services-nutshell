package io.github.devbhuwan.microservices.nutshell.order.service.api;

import io.github.devbhuwan.microservices.nutshell.order.domain.Order;
import io.github.devbhuwan.microservices.nutshell.order.service.OrderApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author Bhuwan Upadhyay
 * @date 2017/05/19
 */

@RestController
@RequestMapping("/order")
public class RESTOrderCatalogService {

    @Autowired
    private OrderApiService orderApiService;

    @GetMapping("/all")
    public List<Order> orders() {
        return orderApiService.orders();
    }

}

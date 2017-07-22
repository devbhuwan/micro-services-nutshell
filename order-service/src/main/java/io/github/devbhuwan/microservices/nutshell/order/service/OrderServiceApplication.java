package io.github.devbhuwan.microservices.nutshell.order.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/07/10
 */
@SpringBootApplication
@EnableAutoConfiguration
@ImportResource(locations = {"classpath:config/service/*.xml"})
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

}

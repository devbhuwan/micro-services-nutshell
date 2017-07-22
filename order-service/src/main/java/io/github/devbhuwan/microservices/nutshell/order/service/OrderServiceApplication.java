package io.github.devbhuwan.microservices.nutshell.order.service;

import io.github.devbhuwan.microservices.nutshell.order.ignite.IgniteConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/07/10
 */
@SpringBootApplication
@ComponentScan(basePackages = "io.github.devbhuwan")
@ImportResource(locations = {"classpath:config/service/*.xml"})
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

}

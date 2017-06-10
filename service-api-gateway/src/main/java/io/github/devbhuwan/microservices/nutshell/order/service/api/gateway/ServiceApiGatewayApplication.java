package io.github.devbhuwan.microservices.nutshell.order.service.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.Configuration;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/06/08
 */
@SpringBootApplication
@EnableZuulProxy
@EnableFeignClients(basePackages = {"io.devbhuwan.github"})
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ServiceApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApiGatewayApplication.class, args);
    }

}

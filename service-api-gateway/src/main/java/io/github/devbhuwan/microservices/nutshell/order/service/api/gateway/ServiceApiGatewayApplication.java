package io.github.devbhuwan.microservices.nutshell.order.service.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/06/08
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApiGatewayApplication.class, args);
    }

}

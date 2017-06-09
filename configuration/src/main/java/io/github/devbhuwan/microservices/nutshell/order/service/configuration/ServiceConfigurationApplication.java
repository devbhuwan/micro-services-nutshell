package io.github.devbhuwan.microservices.nutshell.order.service.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/06/08
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ServiceConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConfigurationApplication.class, args);
    }

}

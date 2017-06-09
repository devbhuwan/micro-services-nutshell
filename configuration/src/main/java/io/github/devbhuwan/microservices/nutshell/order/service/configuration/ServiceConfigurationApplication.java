package io.github.devbhuwan.microservices.nutshell.order.service.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/06/08
 */
@EnableConfigServer
@SpringBootApplication
public class ServiceConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConfigurationApplication.class, args);
    }

}

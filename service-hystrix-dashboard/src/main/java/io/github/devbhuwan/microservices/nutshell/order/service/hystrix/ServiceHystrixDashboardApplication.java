package io.github.devbhuwan.microservices.nutshell.order.service.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/06/10
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableDiscoveryClient
public class ServiceHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHystrixDashboardApplication.class, args);
    }

}

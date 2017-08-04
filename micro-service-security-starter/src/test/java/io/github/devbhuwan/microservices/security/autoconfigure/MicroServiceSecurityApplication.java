package io.github.devbhuwan.microservices.security.autoconfigure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {MicroServiceSecurityAutoConfiguration.BASE_PACKAGE})
public class MicroServiceSecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceSecurityApplication.class, args);
    }
}

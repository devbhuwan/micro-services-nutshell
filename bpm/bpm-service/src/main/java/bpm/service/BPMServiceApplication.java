package bpm.service;

import io.github.devbhuwan.microservices.autoconfigure.MicroServiceAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {BPMServiceApplication.class, MicroServiceAutoConfiguration.class})
public class BPMServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BPMServiceApplication.class, args);
    }

}

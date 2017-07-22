package io.github.devbhuwan.microservices.nutshell.order.ignite;

import lombok.extern.slf4j.Slf4j;
import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@Slf4j
public class IgniteConfiguration {

    @Value("${ignite.cfgPath}")
    private String cgfPath;

    @PostConstruct
    public void beforeConstruct() {
        log.info("START -> " + this.getClass().getName());
    }

    @Bean
    public Ignite igniteInstance() {
        return Ignition.start(cgfPath);
    }

}

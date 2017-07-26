package io.github.devbhuwan.microservices.autoconfigure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.PostConstruct;

@Configuration
@EnableConfigurationProperties(MicroServiceProperties.class)
@Slf4j
public class MicroServiceAutoConfiguration extends WebMvcConfigurerAdapter {

    @Autowired
    private MicroServiceProperties microServiceProperties;

    @PostConstruct
    public void beforeConstruct() {
        log.info("START -> " + this.getClass().getName());
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        if (microServiceProperties.isCorsEnable())
            registry.addMapping("/**");
        else
            super.addCorsMappings(registry);
    }

}

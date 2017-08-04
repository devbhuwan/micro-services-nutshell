package io.github.devbhuwan.microservices.security.autoconfigure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.PostConstruct;

@Configuration
@EnableConfigurationProperties(MicroServiceSecurityProperties.class)
@Slf4j
public class MicroServiceSecurityAutoConfiguration extends WebMvcConfigurerAdapter {

    @Autowired
    private MicroServiceSecurityProperties microServiceSecurityProperties;

    @PostConstruct
    public void beforeConstruct() {
        log.info("START -> " + this.getClass().getName());
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        if (microServiceSecurityProperties.isCorsEnable())
            registry.addMapping("/**");
        else
            super.addCorsMappings(registry);
    }

}

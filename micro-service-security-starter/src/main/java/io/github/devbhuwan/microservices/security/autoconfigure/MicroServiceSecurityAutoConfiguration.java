package io.github.devbhuwan.microservices.security.autoconfigure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.annotation.PostConstruct;

@Configuration
@EnableConfigurationProperties(MicroServiceSecurityProperties.class)
@Slf4j
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class MicroServiceSecurityAutoConfiguration extends WebSecurityConfigurerAdapter {

    public static String BASE_PACKAGE = "io.github.devbhuwan.microservices.security";

    @Autowired
    private MicroServiceSecurityProperties microServiceSecurityProperties;

    @PostConstruct
    public void beforeConstruct() {
        log.info("START -> " + this.getClass().getName());
    }


}

package io.github.devbhuwan.microservices.security.autoconfigure;

import io.github.devbhuwan.microservices.security.filters.BeforeWorkflowApiServiceRequestFilter;
import io.github.devbhuwan.microservices.security.providers.UserAuthenticationProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.annotation.PostConstruct;

@Configuration
@EnableConfigurationProperties(MicroServiceSecurityProperties.class)
@Slf4j
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class MicroServiceSecurityAutoConfiguration extends WebSecurityConfigurerAdapter {

    public static final String BASE_PACKAGE = "io.github.devbhuwan.microservices.security";

    @Autowired
    private MicroServiceSecurityProperties microServiceSecurityProperties;

    @Autowired
    private UserAuthenticationProvider userAuthenticationProvider;

    @PostConstruct
    public void beforeConstruct() {
        log.info("START -> " + this.getClass().getName());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.addFilterBefore(new BeforeWorkflowApiServiceRequestFilter(), BasicAuthenticationFilter.class)
                .authorizeRequests()
                .anyRequest()
                .authenticated();

    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(userAuthenticationProvider);
    }

}

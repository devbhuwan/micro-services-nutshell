package io.github.devbhuwan.microservices.nutshell.order.service;

import com.sun.jersey.spi.spring.container.servlet.SpringServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import javax.servlet.ServletRegistration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/06/09
 */
@SpringBootApplication
@EnableResourceServer
@EnableDiscoveryClient
public class OrderServiceApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(OrderServiceApplication.class);
    }

    @Bean
    public ServletContextInitializer servletInitializer() {
        return servletContext -> {
            final ServletRegistration.Dynamic appServlet = servletContext.addServlet("jersey-servlet", new SpringServlet());
            Map<String, String> filterParameters = new HashMap<>();
            // Set filter parameters
            filterParameters.put("javax.ws.rs.Application", ResourceConfiguration.class.getName());
            appServlet.setInitParameters(filterParameters);
            appServlet.setLoadOnStartup(2);
            appServlet.addMapping("/*");
        };
    }
}

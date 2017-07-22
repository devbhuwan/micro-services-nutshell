package io.github.devbhuwan.microservices.nutshell.ignite.data.starter.autoconfigure;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@EnableConfigurationProperties(ApacheIgniteProperties.class)
@Slf4j
public class ApacheIgniteDataStarterAutoConfiguration {

    @Autowired
    private ApacheIgniteProperties apacheIgniteProperties;

    @PostConstruct
    public void beforeConstruct() {
        log.info("START -> " + this.getClass().getName());
    }

    @Bean
    public Ignite igniteInstance() {
        if (StringUtils.isNotEmpty(apacheIgniteProperties.getXmlConfigurationPath()))
            return Ignition.start(apacheIgniteProperties.getXmlConfigurationPath());
        return Ignition.start(buildCfg());
    }

    @NotNull
    private IgniteConfiguration buildCfg() {
        IgniteConfiguration igniteCfg = new IgniteConfiguration();
        return igniteCfg;
    }

}

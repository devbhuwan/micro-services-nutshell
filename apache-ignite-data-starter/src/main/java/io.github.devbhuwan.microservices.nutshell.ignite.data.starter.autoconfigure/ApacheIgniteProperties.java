package io.github.devbhuwan.microservices.nutshell.ignite.data.starter.autoconfigure;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@ConfigurationProperties(prefix = "devbhuwan.apache.ignite")
@Validated
@Getter
@Setter
public class ApacheIgniteProperties {

    private boolean enable = Boolean.TRUE;
    private String xmlConfigurationPath;
    @NotNull
    private List<Cache> caches;

    @Getter
    @Setter
    public static class Cache {
        private String name;

    }

}

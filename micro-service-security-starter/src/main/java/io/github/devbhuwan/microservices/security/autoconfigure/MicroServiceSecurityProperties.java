package io.github.devbhuwan.microservices.security.autoconfigure;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "devbhuwan.microservice")
@Validated
@Getter
@Setter
public class MicroServiceSecurityProperties {

    private boolean corsEnable = Boolean.TRUE;

}

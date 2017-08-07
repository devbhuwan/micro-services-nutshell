package bpm.service.autoconfigure.props;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import java.util.Set;

@ConfigurationProperties(prefix = "micro.service.bpm.service")
@Validated
@Getter
@Setter
public class MicroServiceBpmProperties {

    private Set<SecurityGroupProperties> securityGroupProperties;

}

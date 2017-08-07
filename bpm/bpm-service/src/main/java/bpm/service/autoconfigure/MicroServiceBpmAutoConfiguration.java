package bpm.service.autoconfigure;

import bpm.service.autoconfigure.props.MicroServiceBpmProperties;
import bpm.service.util.SafeValueUtil;
import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@EnableConfigurationProperties(MicroServiceBpmProperties.class)
@Slf4j
public class MicroServiceBpmAutoConfiguration {

    private static final String GROUP_TYPE = "security-role";

    @Autowired
    private MicroServiceBpmProperties microServiceBpmProperties;

    @PostConstruct
    public void beforeConstruct() {
        log.info("START -> " + this.getClass().getName());
    }

    @Bean
    public InitializingBean usersAndGroupsInitializer(final IdentityService identityService) {
        log.debug("#usersAndGroupsInitializer()....");
        return () -> {
            SafeValueUtil.safe(microServiceBpmProperties.getSecurityGroupProperties()).forEach(role -> {

                log.debug(role.toString());
                Group group = identityService.newGroup("");
                group.setName("users");
                group.setType(GROUP_TYPE);
                identityService.saveGroup(group);
            });
            User admin = identityService.newUser("admin");
            admin.setPassword("admin");
            identityService.saveUser(admin);
        };
    }

}

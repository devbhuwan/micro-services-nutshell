package bpm.service;

import io.github.devbhuwan.microservices.autoconfigure.MicroServiceAutoConfiguration;
import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {BPMServiceApplication.class, MicroServiceAutoConfiguration.class})
public class BPMServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BPMServiceApplication.class, args);
    }

    @Bean
    public InitializingBean usersAndGroupsInitializer(final IdentityService identityService) {
        return () -> {
            Group group = identityService.newGroup("user");
            group.setName("users");
            group.setType("security-role");
            identityService.saveGroup(group);
            User admin = identityService.newUser("admin");
            admin.setPassword("admin");
            identityService.saveUser(admin);
        };
    }

}

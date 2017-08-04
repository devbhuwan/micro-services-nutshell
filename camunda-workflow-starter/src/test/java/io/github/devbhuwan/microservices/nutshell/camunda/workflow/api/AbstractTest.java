package io.github.devbhuwan.microservices.nutshell.camunda.workflow.api;

import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CamundaWorkflowStarterApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public abstract class AbstractTest {

    protected Logger LOG() {
        return log;
    }

}

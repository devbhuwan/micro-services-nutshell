package io.github.devbhuwan.microservices.nutshell.camunda.workflow.api;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.Assert.assertNotNull;

public class RESTWorkflowApiServiceTest extends AbstractTest {

    public static final String WF_REQUEST_APPROVAL = "wf-request-approval";
    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;

    @Test
    public void requesterApporvalWorkflow() throws InterruptedException {
        Thread.sleep(5000);
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(WF_REQUEST_APPROVAL);
        assertNotNull(processInstance);
    }

}
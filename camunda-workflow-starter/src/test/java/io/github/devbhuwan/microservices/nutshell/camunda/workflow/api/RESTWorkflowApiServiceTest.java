package io.github.devbhuwan.microservices.nutshell.camunda.workflow.api;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.task.Task;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        final ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(WF_REQUEST_APPROVAL);
        assertNotNull(processInstance);

        //-> A
        List<Task> ATasks = getTasks(processInstance);
        Map<String, Object> ATaskVariables = new HashMap<>();
        ATaskVariables.put("approved", "false");
        execute(ATasks.get(0), ATaskVariables);
        //-> B
        List<Task> BTasks = getTasks(processInstance);
        Map<String, Object> BTaskVariables = new HashMap<>();
        BTaskVariables.put("approved", "true");
        execute(ATasks.get(0), BTaskVariables);
        List<Task> FinalTasks = getTasks(processInstance);
    }

    private List<Task> getTasks(ProcessInstance processInstance) {
        return taskService.createTaskQuery().processInstanceId(processInstance.getProcessInstanceId()).list();
    }

    private void execute(Task task, Map<String, Object> taskVariables) {
        taskService.complete(task.getId(), taskVariables);
    }

}
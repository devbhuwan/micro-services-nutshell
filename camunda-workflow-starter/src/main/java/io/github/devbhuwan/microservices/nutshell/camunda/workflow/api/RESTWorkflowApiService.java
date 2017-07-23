package io.github.devbhuwan.microservices.nutshell.camunda.workflow.api;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.github.devbhuwan.microservices.nutshell.camunda.workflow.model.ImmutableOperation;
import io.github.devbhuwan.microservices.nutshell.camunda.workflow.model.Operation;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static io.github.devbhuwan.microservices.nutshell.camunda.workflow.model.WorkflowConstants.PROCESS_INSTANCE_ID;

@RestController
@RequestMapping("/workflow")
public class RESTWorkflowApiService {

    public static final String CREATE = "CREATE";
    public static final String LABEL_PREFIX = "label.";
    @Autowired
    private TaskService taskService;
    @Autowired
    private RuntimeService runtimeService;

    @GetMapping("/operations")
    public List<Operation> operations(JsonObject json) {
        JsonElement element = json.get(PROCESS_INSTANCE_ID);
        if (element != null) {
            String processInstanceId = element.getAsString();
            List<Task> tasks = taskService.createTaskQuery().processInstanceId(processInstanceId)
                    .active()
                    .list();
            return tasks.isEmpty() ?
                    buildDefaultOperations()
                    :
                    tasks.stream()
                            .map(task -> buildOperation(task.getTaskDefinitionKey(), task.getName()))
                            .collect(Collectors.toList());
        }
        return buildDefaultOperations();
    }

    private List<Operation> buildDefaultOperations() {
        return Collections.singletonList(buildOperation(CREATE, CREATE));
    }

    private Operation buildOperation(String taskKey, String taskName) {
        return ImmutableOperation.builder().label(LABEL_PREFIX + taskKey).taskKey(taskKey).taskName(taskName).build();
    }

}

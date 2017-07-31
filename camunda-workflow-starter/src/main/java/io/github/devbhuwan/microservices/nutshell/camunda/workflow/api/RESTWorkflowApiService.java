package io.github.devbhuwan.microservices.nutshell.camunda.workflow.api;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.github.devbhuwan.microservices.nutshell.camunda.workflow.model.ImmutableOperation;
import io.github.devbhuwan.microservices.nutshell.camunda.workflow.model.Operation;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static io.github.devbhuwan.microservices.nutshell.camunda.workflow.model.WorkflowConstants.PROCESS_INSTANCE_ID;

@RestController
@RequestMapping("/workflow")
@Slf4j
public class RESTWorkflowApiService {

    public static final String CREATE = "CREATE";
    public static final String LABEL_PREFIX = "label.";
    @Autowired
    private TaskService taskService;
    @Autowired
    private RuntimeService runtimeService;

    @PostMapping("/operations")
    public List<Operation> operations(@RequestBody @NotNull String requestBody) {
        log.info("operations: RequestBody => " + requestBody);
        JsonObject json = new Gson().fromJson(requestBody, JsonObject.class);
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

    @PostMapping("/execute")
    public String execute(@RequestBody @NotNull String requestBody) {
        log.info("execute: RequestBody => " + requestBody);
        return new Gson().toJson("");
    }


    private List<Operation> buildDefaultOperations() {
        return Collections.singletonList(buildOperation(CREATE, CREATE));
    }

    private Operation buildOperation(String taskKey, String taskName) {
        return ImmutableOperation.builder().label(LABEL_PREFIX + taskKey).taskKey(taskKey).taskName(taskName).build();
    }

}

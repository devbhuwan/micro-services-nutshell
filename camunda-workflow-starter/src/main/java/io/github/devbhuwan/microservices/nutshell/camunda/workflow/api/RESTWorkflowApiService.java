package io.github.devbhuwan.microservices.nutshell.camunda.workflow.api;

import com.google.gson.JsonObject;
import io.github.devbhuwan.microservices.nutshell.camunda.workflow.model.ImmutableOperation;
import io.github.devbhuwan.microservices.nutshell.camunda.workflow.model.Operation;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/workflow")
public class RESTWorkflowApiService {

    @Autowired
    private TaskService taskService;
    @Autowired
    private RuntimeService runtimeService;

    @GetMapping("/operations")
    public List<Operation> operations(JsonObject json) {
        return taskService.createTaskQuery().active().list()
                .stream().map(task -> ImmutableOperation.builder()
                        .label("label." + task.getTaskDefinitionKey())
                        .taskKey(task.getTaskDefinitionKey())
                        .taskName(task.getName())
                        .build()).collect(Collectors.toList());
    }

}

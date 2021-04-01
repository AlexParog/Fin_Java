package controller;

import model.Task;
import org.springframework.web.bind.annotation.*;
import repository.TaskRepository;

import java.util.List;

@RestController
@RequestMapping("tasks")
public class TaskController {
    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/getTask={id}")
    Task createTask(@RequestBody Long id) {
        return this.taskRepository.findTaskById(id);
    }

    @GetMapping("/allTasks")
    List<Task> getTasks() {
        return this.taskRepository.findAll();
    }

    // TODO @PostMapping addTask
}

package ingress.organizationtaskmanagement.Controller;

import ingress.organizationtaskmanagement.Dto.OrganizationRequestDto;
import ingress.organizationtaskmanagement.Dto.OrganizationResponseDto;
import ingress.organizationtaskmanagement.Dto.TaskRequestDto;
import ingress.organizationtaskmanagement.Dto.TaskResponseDto;
import ingress.organizationtaskmanagement.Service.TaskServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2/api/task")
@RequiredArgsConstructor
public class TaskController {
    private final TaskServiceImpl taskServiceImpl;

    @GetMapping
    public List<TaskResponseDto> findAll() {
        return taskServiceImpl.findAll();
    }
    @PostMapping()
    public void createTask(@RequestBody TaskRequestDto taskRequestDto) {
        taskServiceImpl.createTask(taskRequestDto);
    }

    @GetMapping("/{id}")
    public TaskResponseDto getTaskById(@PathVariable Long id){
        return taskServiceImpl.getTaskById(id);
    }

    @PutMapping("/{id}")
    public void updateTask(@RequestBody TaskRequestDto taskRequestDto,@PathVariable Long id){
       taskServiceImpl.updateTask(taskRequestDto,id);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
        taskServiceImpl.deleteTask(id);
    }
}

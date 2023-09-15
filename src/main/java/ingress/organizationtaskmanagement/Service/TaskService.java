package ingress.organizationtaskmanagement.Service;

import ingress.organizationtaskmanagement.Dto.OrganizationRequestDto;
import ingress.organizationtaskmanagement.Dto.OrganizationResponseDto;
import ingress.organizationtaskmanagement.Dto.TaskRequestDto;
import ingress.organizationtaskmanagement.Dto.TaskResponseDto;
import ingress.organizationtaskmanagement.Entity.Organization;
import ingress.organizationtaskmanagement.Entity.Task;
import ingress.organizationtaskmanagement.Repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TaskService implements TaskServiceImpl {
    private final ModelMapper modelMapper;
    private final TaskRepository taskRepository;

    @Override
    public List<TaskResponseDto> findAll() {
        return taskRepository
                .findAll()
                .stream()
                .map(task -> modelMapper.map(task, TaskResponseDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public void createTask(TaskRequestDto taskRequestDto) {
        Task task = modelMapper.map(taskRequestDto, Task.class);
        taskRepository.save(task);
    }


    @Override
    public TaskResponseDto getTaskById(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException());
        return modelMapper.map(task, TaskResponseDto.class);
    }

    @Override
    public void updateTask(TaskRequestDto taskRequestDto, Long id) {
        Task task = modelMapper.map(taskRequestDto, Task.class);
        taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}

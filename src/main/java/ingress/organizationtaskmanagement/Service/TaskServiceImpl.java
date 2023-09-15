package ingress.organizationtaskmanagement.Service;

import ingress.organizationtaskmanagement.Dto.TaskRequestDto;
import ingress.organizationtaskmanagement.Dto.TaskResponseDto;

import java.util.List;

public interface TaskServiceImpl {
     List<TaskResponseDto> findAll();
    void createTask(TaskRequestDto taskRequestDto);
    TaskResponseDto getTaskById(Long id);
    void updateTask( TaskRequestDto taskRequestDto,  Long id);
    void deleteTask(Long id);
}

package ingress.organizationtaskmanagement.Controller;

import ingress.organizationtaskmanagement.Dto.TaskRequestDto;
import ingress.organizationtaskmanagement.Dto.TaskResponseDto;
import ingress.organizationtaskmanagement.Dto.UserRequestDto;
import ingress.organizationtaskmanagement.Dto.UserResponseDto;
import ingress.organizationtaskmanagement.Service.UserServiceImpl;
import ingress.organizationtaskmanagement.Service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl userServiceImpl;

    @GetMapping
    public List<UserResponseDto> findAll() {
        return userServiceImpl.findAll();
    }
    @PostMapping()
    public void createUser(@RequestBody UserRequestDto userRequestDto) {
        userServiceImpl.createUser(userRequestDto);
    }

    @GetMapping("/{id}")
    public UserResponseDto getUserById(@PathVariable Long id){
        return userServiceImpl.getUserById(id);
    }

    @PutMapping("/{id}")
    public void updateUser(@RequestBody UserRequestDto userRequestDto,@PathVariable Long id){
        userServiceImpl.updateUser(userRequestDto,id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userServiceImpl.deleteUser(id);
    }
}

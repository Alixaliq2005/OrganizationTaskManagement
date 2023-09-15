package ingress.organizationtaskmanagement.Service;

import ingress.organizationtaskmanagement.Dto.UserRequestDto;
import ingress.organizationtaskmanagement.Dto.UserResponseDto;

import java.util.List;

public interface UserServiceImpl {
    List<UserResponseDto> findAll();
    void createUser(UserRequestDto userRequestDto);
    UserResponseDto getUserById(Long id);
     void updateUser(UserRequestDto userRequestDto, Long id);
    void deleteUser(Long id);
}

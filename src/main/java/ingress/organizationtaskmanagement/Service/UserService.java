package ingress.organizationtaskmanagement.Service;

import ingress.organizationtaskmanagement.Dto.TaskRequestDto;
import ingress.organizationtaskmanagement.Dto.TaskResponseDto;
import ingress.organizationtaskmanagement.Dto.UserRequestDto;
import ingress.organizationtaskmanagement.Dto.UserResponseDto;
import ingress.organizationtaskmanagement.Entity.Task;
import ingress.organizationtaskmanagement.Entity.User;
import ingress.organizationtaskmanagement.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService implements UserServiceImpl {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<UserResponseDto> findAll() {
        return userRepository
                .findAll()
                .stream()
                .map(user -> modelMapper.map(user, UserResponseDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public void createUser(UserRequestDto userRequestDto) {
        User user= modelMapper.map(userRequestDto, User.class);
        userRepository.save(user);
    }


    @Override
    public UserResponseDto getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException());
        return modelMapper.map(user, UserResponseDto.class);
    }

    @Override
    public void updateUser(UserRequestDto userRequestDto, Long id) {
        User user = modelMapper.map(userRequestDto, User.class);
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

package ingress.organizationtaskmanagement.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserResponseDto {
    private Long id;
    private String name;
    private String email;
    private String password;
}

package ingress.organizationtaskmanagement.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserResponseDto {
    private Long id;
    private String name;
    private String surname;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate deadline;
    private String description;
}

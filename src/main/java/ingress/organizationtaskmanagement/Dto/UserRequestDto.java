package ingress.organizationtaskmanagement.Dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserRequestDto {

    private String name;

    private String surname;

    private LocalDate deadline;

    private String description;

}

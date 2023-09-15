package ingress.organizationtaskmanagement.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import ingress.organizationtaskmanagement.Entity.Status;

import java.time.LocalDate;

public class TaskRequestDto {
    private String name;
    Enum<Status>statusEnum;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate date;
}

package ingress.organizationtaskmanagement.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class OrganizationRequestDto {
    private String CompanyName;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate year;
    private Integer workers;

}

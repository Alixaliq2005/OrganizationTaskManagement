package ingress.organizationtaskmanagement.Service;

import ingress.organizationtaskmanagement.Dto.OrganizationRequestDto;
import ingress.organizationtaskmanagement.Dto.OrganizationResponseDto;

import java.util.List;

public interface OrgServiceImpl {
    List<OrganizationResponseDto> findAll();
    void createCar(OrganizationRequestDto organizationRequestDto);
    OrganizationResponseDto getOrgById(Long id);
    void update( OrganizationRequestDto organizationRequestDto,  Long id);
    void delete(Long id);
}

package ingress.organizationtaskmanagement.Controller;

import ingress.organizationtaskmanagement.Dto.OrganizationRequestDto;
import ingress.organizationtaskmanagement.Dto.OrganizationResponseDto;
import ingress.organizationtaskmanagement.Entity.Organization;
import ingress.organizationtaskmanagement.Service.OrgServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/org")
@RequiredArgsConstructor
public class OrganizationController {
    private final OrgServiceImpl orgServiceImpl;

    @GetMapping
    public List<OrganizationResponseDto> findAll() {
        return orgServiceImpl.findAll();
    }

    @PostMapping()
    public void create(@RequestBody OrganizationRequestDto organizationRequestDto) {
        orgServiceImpl.createOrg(organizationRequestDto);
    }

    @GetMapping("/{id}")
    public OrganizationResponseDto getOrgById(@PathVariable Long id){
       return orgServiceImpl.getOrgById(id);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody OrganizationRequestDto organizationRequestDto,@PathVariable Long id){
        orgServiceImpl.update(organizationRequestDto,id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        orgServiceImpl.delete(id);
    }
}
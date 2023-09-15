package ingress.organizationtaskmanagement.Service;

import ingress.organizationtaskmanagement.Dto.OrganizationRequestDto;
import ingress.organizationtaskmanagement.Dto.OrganizationResponseDto;
import ingress.organizationtaskmanagement.Entity.Organization;
import ingress.organizationtaskmanagement.Repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrgService implements OrgServiceImpl {
    private final OrganizationRepository organizationRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<OrganizationResponseDto> findAll(){
        return organizationRepository
                .findAll()
                .stream()
                .map(organization -> modelMapper.map(organization,OrganizationResponseDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public void createCar(OrganizationRequestDto organizationRequestDto){
        Organization organization=modelMapper.map(organizationRequestDto,Organization.class);
        organizationRepository.save(organization);
    }


    @Override
    public OrganizationResponseDto getOrgById(Long id){
        Organization organization= organizationRepository.findById(id).orElseThrow(()->new RuntimeException());
        return modelMapper.map(organization,OrganizationResponseDto.class);
    }

    @Override
    public void update( OrganizationRequestDto organizationRequestDto,  Long id){
        Organization organization= modelMapper.map(organizationRequestDto,Organization.class);
        organizationRepository.save(organization);
    }

    @Override
    public void delete(Long id){
        organizationRepository.deleteById(id);
    }


}

package ingress.organizationtaskmanagement.Repository;

import ingress.organizationtaskmanagement.Entity.Organization;
import ingress.organizationtaskmanagement.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization,Long> {
}

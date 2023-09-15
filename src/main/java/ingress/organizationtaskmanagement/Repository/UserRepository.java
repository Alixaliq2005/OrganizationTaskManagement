package ingress.organizationtaskmanagement.Repository;

import ingress.organizationtaskmanagement.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>  {
}

package ingress.organizationtaskmanagement.Repository;

import ingress.organizationtaskmanagement.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
}

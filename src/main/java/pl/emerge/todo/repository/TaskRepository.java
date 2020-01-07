package pl.emerge.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.emerge.todo.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}

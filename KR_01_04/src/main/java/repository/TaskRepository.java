package repository;

import model.Category;
import model.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    public List<Task> findAll();

    public Task findTaskById(Long id);
}

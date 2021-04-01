package repository;

import model.Category;
import model.Task;
import model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<Task, Long> {
    public List<User> findAll();

    public User findUserById(Long id);
}

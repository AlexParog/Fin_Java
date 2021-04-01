package repository;

import model.Category;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    public List<Category> findAll();

    public Category findCategoryById(Long id);
}

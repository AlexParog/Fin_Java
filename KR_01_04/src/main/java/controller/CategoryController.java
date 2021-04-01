package controller;

import model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import repository.CategoryRepository;

import java.util.List;

public class CategoryController {
    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/getCategory={id}")
    Category getCategory(@PathVariable Long id) {
        return this.categoryRepository.findCategoryById(id);
    }

    @GetMapping("/allCategories")
    List<Category> getCategories() {
        return this.categoryRepository.findAll();
    }

    // TODO @PostMapping addCategory
}

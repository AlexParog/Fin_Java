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

    @GetMapping("/getCathegory={id}")
    Category getCathegory(@PathVariable Long id) {
        return this.categoryRepository.findCategoryById(id);
    }

    @GetMapping("/AllCathegories")
    List<Category> getCathegories() {
        return this.categoryRepository.findAll();
    }

    // TODO @PostMapping addCategory
}

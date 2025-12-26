package ExpenseTrackerApp.expensetrackerapp.services.impl;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoCategory;
import ExpenseTrackerApp.expensetrackerapp.entities.Category;
import ExpenseTrackerApp.expensetrackerapp.mapper.CategoryMapper;
import ExpenseTrackerApp.expensetrackerapp.repositories.CategoryRepository;
import ExpenseTrackerApp.expensetrackerapp.services.interfaces.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private final CategoryMapper categoryMapper;

    @Autowired
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryMapper categoryMapper, CategoryRepository categoryRepository) {
        this.categoryMapper = categoryMapper;
        this.categoryRepository = categoryRepository;
    }


    @Override
    public List<DtoCategory> categoryList() {
       List<Category> categories  = categoryRepository.findAll();
            return categoryMapper.toDtoList(categories) ;


            }

    @Override
    public void deleteCategory(int id) {


            Category category= (Category) categoryRepository.findById(id).orElseThrow();
            categoryRepository.delete(category);

    }

}

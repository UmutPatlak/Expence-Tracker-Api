package ExpenseTrackerApp.expensetrackerapp.services.impl;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoCategory;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoCategoryIU;
import ExpenseTrackerApp.expensetrackerapp.entities.Category;
import ExpenseTrackerApp.expensetrackerapp.exceptions.CategoryNotFoundException;
import ExpenseTrackerApp.expensetrackerapp.exceptions.UnauthorizedActionException;
import ExpenseTrackerApp.expensetrackerapp.mapper.CategoryMapper;
import ExpenseTrackerApp.expensetrackerapp.repositories.CategoryRepository;
import ExpenseTrackerApp.expensetrackerapp.services.interfaces.ICategoryService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    private final CategoryMapper categoryMapper;
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryMapper categoryMapper, CategoryRepository categoryRepository) {
        this.categoryMapper = categoryMapper;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<DtoCategory> categoryList(Integer userId) {
        return categoryMapper.toDtoList(categoryRepository.findByUserId(userId));
    }

    @Override
    public DtoCategory saveCategory(DtoCategoryIU iu, Integer userId) {
        Category category = categoryMapper.toEntity(iu);
        category.setUserId(userId);
        return categoryMapper.toDto(categoryRepository.save(category));
    }

    @Override
    public void deleteCategory(Integer id, Integer userId) {
        Category category = categoryRepository.findByUserIdAndId(userId, id)
                .orElseThrow(CategoryNotFoundException::new);

        if (!category.getUserId().equals(userId)) {
            throw new UnauthorizedActionException();
        }

        categoryRepository.delete(category);
    }

    @Override
    public DtoCategory updateCategory(Integer id, Integer userId, DtoCategoryIU iu) {
        Category category = categoryRepository.findByUserIdAndId(userId, id)
                .orElseThrow(CategoryNotFoundException::new);

        if (!category.getUserId().equals(userId)) {
            throw new UnauthorizedActionException("Kategori size ait değil!");
        }

        category.setDescription(iu.getDescription());
        category.setDescription2(iu.getDescription2());

        return categoryMapper.toDto(categoryRepository.save(category));
    }
}

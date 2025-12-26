package ExpenseTrackerApp.expensetrackerapp.controllers.interfaces;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoCategory;
import ExpenseTrackerApp.expensetrackerapp.entities.Category;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ICategoryController {
     List<DtoCategory> categoryList();
    ResponseEntity<Category> deleteCategory();

}

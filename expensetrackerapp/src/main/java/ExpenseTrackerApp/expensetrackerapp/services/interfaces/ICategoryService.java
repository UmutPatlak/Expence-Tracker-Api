package ExpenseTrackerApp.expensetrackerapp.services.interfaces;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoCategory;

import java.util.List;

public interface ICategoryService {

     List<DtoCategory> categoryList();

     void deleteCategory(int id);


}

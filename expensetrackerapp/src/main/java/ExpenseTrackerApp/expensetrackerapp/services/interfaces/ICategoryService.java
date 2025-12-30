package ExpenseTrackerApp.expensetrackerapp.services.interfaces;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoCategory;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoCategoryIU;
import java.util.List;

public interface ICategoryService {

    List<DtoCategory> categoryList(Integer userId);

    DtoCategory saveCategory(DtoCategoryIU dtoCategoryIU, Integer userId);

    void deleteCategory(Integer id, Integer userId);

    DtoCategory updateCategory(Integer id, Integer userId, DtoCategoryIU dtoCategoryIU);
}

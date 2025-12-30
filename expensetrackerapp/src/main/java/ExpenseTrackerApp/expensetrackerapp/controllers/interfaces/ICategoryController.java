package ExpenseTrackerApp.expensetrackerapp.controllers.interfaces;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoCategory;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoCategoryIU;
import org.springframework.http.ResponseEntity;
import java.util.List;

public interface ICategoryController {

    ResponseEntity<List<DtoCategory>> categoryList(String authHeader);

    ResponseEntity<DtoCategory> saveCategory(DtoCategoryIU iu, String authHeader);

    ResponseEntity<Void> deletingCategory(Integer id, String authHeader);

    ResponseEntity<DtoCategory> updateCategory(Integer id, DtoCategoryIU iu, String authHeader);
}

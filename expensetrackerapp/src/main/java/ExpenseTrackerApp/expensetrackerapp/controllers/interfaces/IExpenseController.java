package ExpenseTrackerApp.expensetrackerapp.controllers.interfaces;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoExpense;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IExpenseController {

    ResponseEntity<DtoExpense> createExpense(DtoExpense dtoExpense);

    ResponseEntity<List<DtoExpense>> getAllExpenses();

    ResponseEntity<DtoExpense> getExpenseById(Integer id);
}

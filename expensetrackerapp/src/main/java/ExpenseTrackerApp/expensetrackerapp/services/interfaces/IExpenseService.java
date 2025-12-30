package ExpenseTrackerApp.expensetrackerapp.services.interfaces;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoExpense;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoExpenseIU;

import java.util.List;

public interface IExpenseService {

    List<DtoExpense> getAllExpenses(Integer userId);

    DtoExpense saveExpense(DtoExpenseIU dtoExpenseIU, Integer userId);

    DtoExpense getExpenseById(Integer id, Integer userId);

    DtoExpense updateExpense(Integer id, Integer userId, DtoExpenseIU dtoExpenseIU);

    void deleteExpense(Integer id, Integer userId);
}

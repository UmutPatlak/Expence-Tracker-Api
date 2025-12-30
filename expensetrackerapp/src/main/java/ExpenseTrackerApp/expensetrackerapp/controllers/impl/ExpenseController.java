package ExpenseTrackerApp.expensetrackerapp.controllers.impl;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoExpense;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoExpenseIU;
import ExpenseTrackerApp.expensetrackerapp.services.interfaces.IExpenseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final IExpenseService expenseService;

    public ExpenseController(IExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public ResponseEntity<DtoExpense> createExpense(@RequestBody DtoExpenseIU dtoExpenseIU,
                                                    @RequestParam Integer userId) {
        DtoExpense saved = expenseService.saveExpense(dtoExpenseIU, userId);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<List<DtoExpense>> getAllExpenses(@RequestParam Integer userId) {
        List<DtoExpense> expenses = expenseService.getAllExpenses(userId);
        return ResponseEntity.ok(expenses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DtoExpense> getExpenseById(@PathVariable Integer id,
                                                     @RequestParam Integer userId) {
        DtoExpense expense = expenseService.getExpenseById(id, userId);
        return ResponseEntity.ok(expense);
    }
}

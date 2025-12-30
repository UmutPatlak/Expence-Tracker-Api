package ExpenseTrackerApp.expensetrackerapp.services.impl;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoExpense;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoExpenseIU;
import ExpenseTrackerApp.expensetrackerapp.entities.Expense;
import ExpenseTrackerApp.expensetrackerapp.mapper.IExpenseMapper;
import ExpenseTrackerApp.expensetrackerapp.repositories.ExpenseRepository;
import ExpenseTrackerApp.expensetrackerapp.services.interfaces.IExpenseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ExpenseService  implements IExpenseService {

        private final ExpenseRepository expenseRepository;
        private final IExpenseMapper expenseMapper;

    public ExpenseService(ExpenseRepository expenseRepository, IExpenseMapper expenseMapper) {
        this.expenseRepository = expenseRepository;
        this.expenseMapper = expenseMapper;
    }


    @Override
        public DtoExpense saveExpense(DtoExpenseIU dtoExpenseIU, Integer userId) {
            Expense expense = expenseMapper.toEntity(dtoExpenseIU);
            expense.setUserId(userId); // userId ataması
            Expense saved = expenseRepository.save(expense);
            return expenseMapper.toDto(saved);
        }

        @Override
        public List<DtoExpense> getAllExpenses(Integer userId) {
            return expenseRepository.findAllByUserId(userId)
                    .stream()
                    .map(expenseMapper::toDto)
                    .collect(Collectors.toList());
        }

        @Override
        public DtoExpense getExpenseById(Integer id, Integer userId) {
            Expense expense = expenseRepository.findByIdAndUserId(id, userId)
                    .orElseThrow(() -> new RuntimeException("Expense not found for user with id: " + id));
            return expenseMapper.toDto(expense);
        }

        @Override
        public DtoExpense updateExpense(Integer id, Integer userId, DtoExpenseIU dtoExpenseIU) {
            Expense expense = expenseRepository.findByIdAndUserId(id, userId)
                    .orElseThrow(() -> new RuntimeException("Expense not found for update with id: " + id));

            expenseMapper.updateEntityFromDto(dtoExpenseIU, expense);
            Expense updated = expenseRepository.save(expense);
            return expenseMapper.toDto(updated);
        }

        @Override
        public void deleteExpense(Integer id, Integer userId) {
            Expense expense = expenseRepository.findByIdAndUserId(id, userId)
                    .orElseThrow(() -> new RuntimeException("Expense not found for deletion with id: " + id));
            expenseRepository.delete(expense);
        }
    }

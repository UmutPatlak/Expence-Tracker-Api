package ExpenseTrackerApp.expensetrackerapp.mapper;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoExpense;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoExpenseIU;
import ExpenseTrackerApp.expensetrackerapp.entities.Expense;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface IExpenseMapper {

    Expense toEntity(DtoExpenseIU dtoExpenseIU);

    DtoExpense toDto(Expense expense);

    void updateEntityFromDto(DtoExpenseIU dtoExpenseIU, @MappingTarget Expense expense);
}

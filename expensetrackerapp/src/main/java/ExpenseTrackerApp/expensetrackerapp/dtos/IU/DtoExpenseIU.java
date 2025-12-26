package ExpenseTrackerApp.expensetrackerapp.dtos.IU;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoCategory;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class DtoExpenseIU {
    @Getter
    @Setter
    private double expense;
    @Getter
    private LocalDateTime date;
    @Getter
    @Setter
    private DtoCategory dtoCategory;

}

package ExpenseTrackerApp.expensetrackerapp.dtos;

import lombok.*;

import java.time.LocalDateTime;


public class DtoExpense {
    @Getter
    @Setter
    private double expense;
    @Getter
    private LocalDateTime date;
    @Getter
    @Setter
    private DtoCategory dtoCategory;

}

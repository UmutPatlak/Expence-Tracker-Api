package ExpenseTrackerApp.expensetrackerapp.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class DtoExpense {
    @Getter @Setter
    private Integer id;

    @Getter @Setter
    private double expense;

    @Getter @Setter
    private LocalDateTime date;

    @Getter @Setter
    private Integer categoryId; // dtoCategory yerine sadece categoryId
}

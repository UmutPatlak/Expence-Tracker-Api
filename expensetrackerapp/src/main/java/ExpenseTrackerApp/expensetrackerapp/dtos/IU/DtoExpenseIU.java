package ExpenseTrackerApp.expensetrackerapp.dtos.IU;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoCategory;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoExpenseIU {
    private double expense;
    private Integer categoryId;
    private Integer userId;
}

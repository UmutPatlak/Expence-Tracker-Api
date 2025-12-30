package ExpenseTrackerApp.expensetrackerapp.dtos.IU;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoCategory;
import ExpenseTrackerApp.expensetrackerapp.dtos.DtoUser;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoWalletIU {
    private double account;
    private double wage;
    private double debt;
    private Integer userId;
    private List<Integer> categoryIds;
}

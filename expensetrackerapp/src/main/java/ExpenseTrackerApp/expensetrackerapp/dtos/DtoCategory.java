package ExpenseTrackerApp.expensetrackerapp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoCategory {
    private Integer id;
    private String description;
    private String description2;
    private Integer userId;
    private Integer walletId;
    private List<DtoExpense> expenses;
}

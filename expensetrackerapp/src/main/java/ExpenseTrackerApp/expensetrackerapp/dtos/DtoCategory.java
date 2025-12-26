package ExpenseTrackerApp.expensetrackerapp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoCategory {
    private String decsription;
    private String description2;
    private DtoWallet dtoWallet;
    private List<DtoExpense> dtoExpense;


}

package ExpenseTrackerApp.expensetrackerapp.dtos.IU;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoExpense;
import ExpenseTrackerApp.expensetrackerapp.dtos.DtoWallet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoCategoryIU {
    private String decsription;
    private String description2;
    private DtoWallet dtoWallet;
    private List<DtoExpense> dtoExpense;

}

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
    private String description;
    private String description2;
    private Integer walletId;
    private Integer userId;
}


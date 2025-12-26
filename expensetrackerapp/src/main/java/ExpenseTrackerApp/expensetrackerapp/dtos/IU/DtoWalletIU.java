package ExpenseTrackerApp.expensetrackerapp.dtos.IU;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoCategory;
import ExpenseTrackerApp.expensetrackerapp.dtos.DtoUser;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

public class DtoWalletIU {
    @Getter
    @Setter
    private double account;
    @Getter
    @Setter
    private double wage;
    @Getter
    @Setter
    private double debt;
    @Getter
    private LocalDateTime dateNow;
    @Getter
    @Setter
    private List<DtoCategory> category;
    @Getter
    @Setter
    private DtoUser dtoUser;
}

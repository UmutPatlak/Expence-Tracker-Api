package ExpenseTrackerApp.expensetrackerapp.dtos;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoWallet {
    private Integer id;
    private double account;
    private double wage;
    private double debt;

    private LocalDateTime dateNow;
    private Integer userId;
    private List<Integer> categoryIds;
}

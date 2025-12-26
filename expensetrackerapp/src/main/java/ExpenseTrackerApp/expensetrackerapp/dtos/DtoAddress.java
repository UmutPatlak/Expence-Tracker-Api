package ExpenseTrackerApp.expensetrackerapp.dtos;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoAddress {
    private String neighbourhood;
    private String no;
    private String city;
    private String country;
    private String street;
}

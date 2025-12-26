package ExpenseTrackerApp.expensetrackerapp.dtos.IU;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoAddressIU {

    private String neighbourhood;
    private String no;
    private String city;
    private String country;
    private String street;
}

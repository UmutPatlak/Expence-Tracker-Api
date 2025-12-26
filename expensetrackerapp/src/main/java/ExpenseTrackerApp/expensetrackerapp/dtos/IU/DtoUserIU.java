package ExpenseTrackerApp.expensetrackerapp.dtos.IU;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoUserIU {
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String password;

}

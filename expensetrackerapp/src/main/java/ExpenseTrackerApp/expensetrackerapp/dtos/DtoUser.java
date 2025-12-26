package ExpenseTrackerApp.expensetrackerapp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoUser {

    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String password;

}

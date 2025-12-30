package ExpenseTrackerApp.expensetrackerapp.controllers.interfaces;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoUser;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoUserIU;

import java.util.List;

public interface IUserController {
    DtoUser createUser(DtoUserIU dtoUserIU);
    List<DtoUser> getAllUsers();
    DtoUser getUserById(Integer id);
}

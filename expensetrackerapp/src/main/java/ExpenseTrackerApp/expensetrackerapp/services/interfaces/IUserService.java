package ExpenseTrackerApp.expensetrackerapp.services.interfaces;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoUser;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoUserIU;

import java.util.List;

public interface IUserService {
    DtoUser createUser(DtoUserIU dtoUserIU);
    DtoUser getUserById(Integer id);
    List<DtoUser> getAllUsers();
}

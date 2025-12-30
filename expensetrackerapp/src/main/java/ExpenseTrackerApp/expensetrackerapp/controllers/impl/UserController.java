package ExpenseTrackerApp.expensetrackerapp.controllers.impl;

import ExpenseTrackerApp.expensetrackerapp.controllers.interfaces.IUserController;
import ExpenseTrackerApp.expensetrackerapp.dtos.DtoUser;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoUserIU;
import ExpenseTrackerApp.expensetrackerapp.services.impl.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController implements IUserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Override
    @PostMapping
    public DtoUser createUser(@RequestBody DtoUserIU dtoUserIU) {
        return userService.createUser(dtoUserIU);
    }

    @Override
    @GetMapping
    public List<DtoUser> getAllUsers() {
        return userService.getAllUsers();
    }

    @Override
    @GetMapping("/{id}")
    public DtoUser getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }
}

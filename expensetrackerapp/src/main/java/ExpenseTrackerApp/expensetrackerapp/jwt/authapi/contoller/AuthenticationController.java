package ExpenseTrackerApp.expensetrackerapp.jwt.authapi.contoller;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoUser;
import ExpenseTrackerApp.expensetrackerapp.entities.User;
import ExpenseTrackerApp.expensetrackerapp.jwt.authapi.configs.AuthenticationService;
import ExpenseTrackerApp.expensetrackerapp.jwt.authapi.dtos.LoginUserDto;
import ExpenseTrackerApp.expensetrackerapp.jwt.authapi.dtos.RegisterUserDto;
import ExpenseTrackerApp.expensetrackerapp.jwt.authapi.responses.LoginResponse;
import ExpenseTrackerApp.expensetrackerapp.jwt.authapi.services.JwtService;
import ExpenseTrackerApp.expensetrackerapp.mapper.IUserMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    private final JwtService jwtService;
    private final AuthenticationService authenticationService;
    private final IUserMapper userMapper;

    public AuthenticationController(
            JwtService jwtService,
            AuthenticationService authenticationService,
            IUserMapper userMapper
    ) {
        this.jwtService = jwtService;
        this.authenticationService = authenticationService;
        this.userMapper = userMapper;
    }

    @PostMapping("/signup")
    public ResponseEntity<DtoUser> signup(@RequestBody RegisterUserDto registerUserDto) {
        User user = authenticationService.signup(registerUserDto);
        return ResponseEntity.ok(userMapper.toDto(user));
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginUserDto loginUserDto) {
        User user = authenticationService.authenticate(loginUserDto);
        String token = jwtService.generateToken(user);

        LoginResponse response = new LoginResponse();
        response.setToken(token);
        response.setExpiresIn(jwtService.getExpirationTime());

        return ResponseEntity.ok(response);
    }
}

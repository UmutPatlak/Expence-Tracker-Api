package ExpenseTrackerApp.expensetrackerapp.jwt.authapi.configs;

import ExpenseTrackerApp.expensetrackerapp.entities.User;
import ExpenseTrackerApp.expensetrackerapp.jwt.authapi.dtos.LoginUserDto;
import ExpenseTrackerApp.expensetrackerapp.jwt.authapi.dtos.RegisterUserDto;
import ExpenseTrackerApp.expensetrackerapp.repositories.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthenticationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public AuthenticationService(
            UserRepository userRepository,
            AuthenticationManager authenticationManager,
            PasswordEncoder passwordEncoder
    ) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public User signup(RegisterUserDto input) {
        User user = new User();

        if (input.getFullName() != null && !input.getFullName().isEmpty()) {
            String[] names = input.getFullName().trim().split(" ", 2);
            user.setFirstName(names[0]);
            user.setLastName(names.length > 1 ? names[1] : "");
            user.setFullName(input.getFullName().trim());
        }

        user.setEmail(input.getEmail().trim().toLowerCase());
        user.setPassword(passwordEncoder.encode(input.getPassword().trim()));

        return userRepository.save(user);
    }


    public User authenticate(LoginUserDto input) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        input.getEmail().trim().toLowerCase(),
                        input.getPassword().trim()
                )
        );

        return userRepository.findByEmail(input.getEmail().trim().toLowerCase())
                .orElseThrow(() -> new RuntimeException("User Not Found: " + input.getEmail()));
    }
}

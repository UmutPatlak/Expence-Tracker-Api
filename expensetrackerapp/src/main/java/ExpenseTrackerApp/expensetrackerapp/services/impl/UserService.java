package ExpenseTrackerApp.expensetrackerapp.services.impl;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoUser;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoUserIU;
import ExpenseTrackerApp.expensetrackerapp.entities.User;
import ExpenseTrackerApp.expensetrackerapp.mapper.IUserMapper;
import ExpenseTrackerApp.expensetrackerapp.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final IUserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, IUserMapper userMapper, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    public DtoUser createUser(DtoUserIU dtoIU) {
        User user = userMapper.toEntity(dtoIU);
        user.setPassword(passwordEncoder.encode(dtoIU.getPassword()));
        User saved = userRepository.save(user);
        return userMapper.toDto(saved);
    }

    public List<DtoUser> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::toDto)
                .collect(Collectors.toList());
    }

    public DtoUser getUserById(Integer id) {
        return userRepository.findById(id)
                .map(userMapper::toDto)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }
}

package ExpenseTrackerApp.expensetrackerapp.exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException() {
        super("Kullanıcı bulunamadı!");
    }
}

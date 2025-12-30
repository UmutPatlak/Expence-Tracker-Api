package ExpenseTrackerApp.expensetrackerapp.exceptions;

public class EmailAlreadyExistsException extends RuntimeException {

    public EmailAlreadyExistsException(String message) {
        super(message);
    }

    public EmailAlreadyExistsException() {
        super("Bu email zaten kayıtlı!");
    }
}

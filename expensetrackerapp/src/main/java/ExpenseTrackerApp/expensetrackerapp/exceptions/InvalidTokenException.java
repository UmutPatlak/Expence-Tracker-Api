package ExpenseTrackerApp.expensetrackerapp.exceptions;

public class InvalidTokenException extends RuntimeException {

    public InvalidTokenException(String message) {
        super(message);
    }

    public InvalidTokenException() {
        super("Geçersiz veya süresi dolmuş JWT token!");
    }
}

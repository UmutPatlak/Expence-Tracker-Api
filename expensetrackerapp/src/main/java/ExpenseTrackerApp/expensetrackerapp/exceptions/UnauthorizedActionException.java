package ExpenseTrackerApp.expensetrackerapp.exceptions;

public class UnauthorizedActionException extends RuntimeException {

    public UnauthorizedActionException(String message) {
        super(message);
    }

    public UnauthorizedActionException() {
        super("Bu işlem için yetkiniz yok!");
    }
}

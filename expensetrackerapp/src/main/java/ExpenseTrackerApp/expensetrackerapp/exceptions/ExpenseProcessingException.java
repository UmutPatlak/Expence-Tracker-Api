package ExpenseTrackerApp.expensetrackerapp.exceptions;

public class ExpenseProcessingException extends RuntimeException {

    public ExpenseProcessingException(String message) {
        super(message);
    }

    public ExpenseProcessingException() {
        super("Harcama işlenirken bir hata oluştu!");
    }
}

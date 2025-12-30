package ExpenseTrackerApp.expensetrackerapp.exceptions;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException(String message) {
        super(message);
    }

    public CategoryNotFoundException() {
        super("Kategori bulunamadı!");
    }
}

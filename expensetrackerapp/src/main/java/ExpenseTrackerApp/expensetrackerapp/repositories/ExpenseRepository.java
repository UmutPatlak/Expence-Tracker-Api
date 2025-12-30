package ExpenseTrackerApp.expensetrackerapp.repositories;

import ExpenseTrackerApp.expensetrackerapp.entities.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

    List<Expense> findAllByUserId(Integer userId);

    Optional<Expense> findByIdAndUserId(Integer id, Integer userId);
}

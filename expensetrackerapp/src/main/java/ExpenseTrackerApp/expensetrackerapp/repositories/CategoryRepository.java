package ExpenseTrackerApp.expensetrackerapp.repositories;

import ExpenseTrackerApp.expensetrackerapp.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    List<Category> findByUserId(Integer userId);

    Optional<Category> findByUserIdAndId(Integer userId, Integer id);
}

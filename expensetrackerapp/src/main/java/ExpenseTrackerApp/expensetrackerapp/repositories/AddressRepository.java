package ExpenseTrackerApp.expensetrackerapp.repositories;

import ExpenseTrackerApp.expensetrackerapp.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}

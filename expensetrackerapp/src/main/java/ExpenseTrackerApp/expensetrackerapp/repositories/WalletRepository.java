package ExpenseTrackerApp.expensetrackerapp.repositories;

import ExpenseTrackerApp.expensetrackerapp.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Integer> {
}

package ExpenseTrackerApp.expensetrackerapp.controllers.interfaces;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoWallet;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IWalletController {

    ResponseEntity<DtoWallet> createWallet(DtoWallet dtoWallet);

    ResponseEntity<List<DtoWallet>> getAllWallets();

    ResponseEntity<DtoWallet> getWalletById(Integer id);
}

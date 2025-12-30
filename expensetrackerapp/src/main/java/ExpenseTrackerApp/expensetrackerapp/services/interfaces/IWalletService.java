package ExpenseTrackerApp.expensetrackerapp.services.interfaces;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoWallet;

import java.util.List;

public interface IWalletService {
    DtoWallet saveWallet(DtoWallet dtoWallet);
    List<DtoWallet> getAllWallets();
    DtoWallet getWalletById(Integer id);
}

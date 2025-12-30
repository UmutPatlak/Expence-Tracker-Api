package ExpenseTrackerApp.expensetrackerapp.controllers.impl;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoWallet;
import ExpenseTrackerApp.expensetrackerapp.services.interfaces.IWalletService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wallets")
public class WalletController {

    private final IWalletService walletService;

    public WalletController(IWalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping
    public ResponseEntity<DtoWallet> createWallet(@RequestBody DtoWallet dtoWallet) {
        DtoWallet savedWallet = walletService.saveWallet(dtoWallet);
        return ResponseEntity.ok(savedWallet);
    }

    @GetMapping
    public ResponseEntity<List<DtoWallet>> getAllWallets() {
        List<DtoWallet> wallets = walletService.getAllWallets();
        return ResponseEntity.ok(wallets);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DtoWallet> getWalletById(@PathVariable Integer id) {
        DtoWallet wallet = walletService.getWalletById(id);
        return ResponseEntity.ok(wallet);
    }
}

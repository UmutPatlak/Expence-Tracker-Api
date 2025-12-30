package ExpenseTrackerApp.expensetrackerapp.services.impl;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoWallet;
import ExpenseTrackerApp.expensetrackerapp.entities.Wallet;
import ExpenseTrackerApp.expensetrackerapp.mapper.IWalletMapper;
import ExpenseTrackerApp.expensetrackerapp.repositories.WalletRepository;
import ExpenseTrackerApp.expensetrackerapp.services.interfaces.IWalletService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WalletService implements IWalletService {

    private final WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    @Override
    public DtoWallet saveWallet(DtoWallet dtoWallet) {
        Wallet wallet = IWalletMapper.toEntity(dtoWallet);
        Wallet savedWallet = walletRepository.save(wallet);
        return IWalletMapper.toDto(savedWallet);
    }

    @Override
    public List<DtoWallet> getAllWallets() {
        return walletRepository.findAll()
                .stream()
                .map(IWalletMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public DtoWallet getWalletById(Integer id) {
        Wallet wallet = walletRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Wallet not found: " + id));
        return IWalletMapper.toDto(wallet);
    }
}

package ExpenseTrackerApp.expensetrackerapp.mapper;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoWallet;
import ExpenseTrackerApp.expensetrackerapp.entities.Wallet;

public class IWalletMapper {

    public static Wallet toEntity(DtoWallet dto) {
        if (dto == null) return null;

        Wallet wallet = new Wallet();
        wallet.setAccount(dto.getAccount());
        wallet.setDebt(dto.getDebt());
        wallet.setWage(dto.getWage());
        wallet.setDateNow(dto.getDateNow());
        return wallet;
    }

    public static DtoWallet toDto(Wallet wallet) {
        if (wallet == null) return null;

        DtoWallet dto = new DtoWallet();
        dto.setAccount(wallet.getAccount());
        dto.setDebt(wallet.getDebt());
        dto.setWage(wallet.getWage());
        dto.setDateNow(wallet.getDateNow());
        return dto;
    }
}

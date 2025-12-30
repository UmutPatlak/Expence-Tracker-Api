package ExpenseTrackerApp.expensetrackerapp.services.interfaces;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoAddress;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoAddressIU;

import java.util.List;

public interface IAddressService {
    DtoAddress createAddress(DtoAddressIU dtoAddressIU);
    DtoAddress getAddressById(Integer id);
    List<DtoAddress> getAllAddresses();
}

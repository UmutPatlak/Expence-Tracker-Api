package ExpenseTrackerApp.expensetrackerapp.controllers.interfaces;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoAddress;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoAddressIU;

import java.util.List;

public interface IAddressController {

    DtoAddress createAddress(DtoAddressIU dtoAddressIU);

    List<DtoAddress> getAllAddresses();

    DtoAddress getAddressById(Integer id);

    DtoAddress updateAddress(Integer id, DtoAddressIU dtoAddressIU);

    void deleteAddress(Integer id);
}

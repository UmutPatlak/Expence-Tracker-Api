package ExpenseTrackerApp.expensetrackerapp.controllers.impl;

import ExpenseTrackerApp.expensetrackerapp.controllers.interfaces.IAddressController;
import ExpenseTrackerApp.expensetrackerapp.dtos.DtoAddress;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoAddressIU;
import ExpenseTrackerApp.expensetrackerapp.services.impl.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController implements IAddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @Override
    @PostMapping
    public DtoAddress createAddress(@RequestBody DtoAddressIU dtoAddressIU) {
        return addressService.createAddress(dtoAddressIU);
    }

    @Override
    @GetMapping
    public List<DtoAddress> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @Override
    @GetMapping(path = "getAddressById/{id}")
    public DtoAddress getAddressById(@PathVariable Integer id) {
        return addressService.getAddressById(id);
    }

    @Override
    @PutMapping(path = "update/{id}")
    public DtoAddress updateAddress(@PathVariable Integer id, @RequestBody DtoAddressIU dtoAddressIU) {
        return addressService.updateAddress(id, dtoAddressIU);
    }

    @Override
    @DeleteMapping(path = "delete/{id}")
    public void deleteAddress(@PathVariable Integer id) {
        addressService.deleteAddress(id);
    }
}

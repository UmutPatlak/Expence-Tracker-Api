package ExpenseTrackerApp.expensetrackerapp.services.impl;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoAddress;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoAddressIU;
import ExpenseTrackerApp.expensetrackerapp.entities.Address;
import ExpenseTrackerApp.expensetrackerapp.mapper.IAddressMapper;
import ExpenseTrackerApp.expensetrackerapp.repositories.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressService {

    private final AddressRepository addressRepository;
    private final IAddressMapper addressMapper;

    public AddressService(AddressRepository addressRepository, IAddressMapper addressMapper) {
        this.addressRepository = addressRepository;
        this.addressMapper = addressMapper;
    }

    public DtoAddress createAddress(DtoAddressIU dtoAddressIU) {
        Address address = addressMapper.toEntity(dtoAddressIU);
        Address saved = addressRepository.save(address);
        return addressMapper.toDto(saved);
    }

    public List<DtoAddress> getAllAddresses() {
        return addressRepository.findAll().stream()
                .map(addressMapper::toDto)
                .collect(Collectors.toList());
    }

    public DtoAddress getAddressById(Integer id) {
        return addressRepository.findById(id)
                .map(addressMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Address not found with id: " + id));
    }

    public DtoAddress updateAddress(Integer id, DtoAddressIU dtoAddressIU) {
        Address existing = addressRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Address not found with id: " + id));

        existing.setNeighbourhood(dtoAddressIU.getNeighbourhood());
        existing.setNo(dtoAddressIU.getNo());
        existing.setCity(dtoAddressIU.getCity());
        existing.setCountry(dtoAddressIU.getCountry());
        existing.setStreet(dtoAddressIU.getStreet());

        Address updated = addressRepository.save(existing);
        return addressMapper.toDto(updated);
    }

    public void deleteAddress(Integer id) {
        addressRepository.deleteById(id);
    }
}

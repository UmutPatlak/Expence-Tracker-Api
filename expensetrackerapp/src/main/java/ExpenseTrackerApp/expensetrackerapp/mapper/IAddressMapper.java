package ExpenseTrackerApp.expensetrackerapp.mapper;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoAddress;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoAddressIU;
import ExpenseTrackerApp.expensetrackerapp.entities.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface IAddressMapper {

    DtoAddress toDto(Address address);

    Address toEntity(DtoAddress dto);

    Address toEntity(DtoAddressIU dtoIU);
}

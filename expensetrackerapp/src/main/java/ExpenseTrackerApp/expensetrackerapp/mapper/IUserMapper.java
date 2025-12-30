package ExpenseTrackerApp.expensetrackerapp.mapper;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoUser;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoUserIU;
import ExpenseTrackerApp.expensetrackerapp.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IUserMapper {

    IUserMapper INSTANCE = Mappers.getMapper(IUserMapper.class);

    User toEntity(DtoUserIU dtoUserIU);

    DtoUser toDto(User user);
}

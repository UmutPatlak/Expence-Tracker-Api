package ExpenseTrackerApp.expensetrackerapp.mapper;


import ExpenseTrackerApp.expensetrackerapp.dtos.DtoCategory;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoCategoryIU;
import ExpenseTrackerApp.expensetrackerapp.entities.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    DtoCategory toDto(Category category);
    List<DtoCategory> toDtoList(List<Category>categories);
    Category toEntity(DtoCategoryIU dtoCategoryIU);

}

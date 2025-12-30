package ExpenseTrackerApp.expensetrackerapp.mapper;

import ExpenseTrackerApp.expensetrackerapp.dtos.DtoCategory;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoCategoryIU;
import ExpenseTrackerApp.expensetrackerapp.entities.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {IExpenseMapper.class})
public interface CategoryMapper {

    DtoCategory toDto(Category category);

    Category toEntity(DtoCategory dtoCategory);

    Category toEntity(DtoCategoryIU dtoCategoryIU);  // ✅ IU için ekledik

    List<DtoCategory> toDtoList(List<Category> categories);
}

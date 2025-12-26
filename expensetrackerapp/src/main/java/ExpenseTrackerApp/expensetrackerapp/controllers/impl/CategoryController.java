    package ExpenseTrackerApp.expensetrackerapp.controllers.impl;


    import ExpenseTrackerApp.expensetrackerapp.controllers.interfaces.ICategoryController;
    import ExpenseTrackerApp.expensetrackerapp.dtos.DtoCategory;
    import ExpenseTrackerApp.expensetrackerapp.services.impl.CategoryService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    import java.util.List;

    @RestController
    @RequestMapping(path = "/api/category")
    public class CategoryController implements ICategoryController {

        @Autowired
        private final CategoryService categoryService;

        public CategoryController(CategoryService categoryService) {
            this.categoryService = categoryService;
        }

        @Override
        @GetMapping(path = "/all")
        public List<DtoCategory> categoryList() {
            return categoryService.categoryList();

        }
    }

package ExpenseTrackerApp.expensetrackerapp.controllers.impl;


import ExpenseTrackerApp.expensetrackerapp.controllers.interfaces.ICategoryController;
import ExpenseTrackerApp.expensetrackerapp.dtos.DtoCategory;
import ExpenseTrackerApp.expensetrackerapp.dtos.IU.DtoCategoryIU;
import ExpenseTrackerApp.expensetrackerapp.entities.Category;
import ExpenseTrackerApp.expensetrackerapp.jwt.authapi.services.JwtService;
import ExpenseTrackerApp.expensetrackerapp.services.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController implements ICategoryController {

    private final CategoryService categoryService;
    private final JwtService jwtService;

    public CategoryController(CategoryService categoryService, JwtService jwtService) {
        this.categoryService = categoryService;
        this.jwtService = jwtService;
    }

    private Integer getUserFromToken(String authHeader) {
        String token = authHeader.replace("Bearer ", "");
        if (!jwtService.validateToken(token))
            throw new RuntimeException("Invalid Token");
        return jwtService.extractUserId(token);
    }

    @Override
    @GetMapping("/all")
    public ResponseEntity<List<DtoCategory>> categoryList(@RequestHeader("Authorization") String authHeader) {
        Integer userId = getUserFromToken(authHeader);
        return ResponseEntity.ok(categoryService.categoryList(userId));
    }

    @Override
    @PostMapping("/save")
    public ResponseEntity<DtoCategory> saveCategory(@RequestBody DtoCategoryIU iu,
                                                    @RequestHeader("Authorization") String authHeader) {
        Integer userId = getUserFromToken(authHeader);
        return ResponseEntity.ok(categoryService.saveCategory(iu, userId));
    }

    @Override
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletingCategory(@PathVariable Integer id,
                                                 @RequestHeader("Authorization") String authHeader) {
        Integer userId = getUserFromToken(authHeader);
        categoryService.deleteCategory(id, userId);
        return ResponseEntity.ok().build();
    }

    @Override
    @PutMapping("/update/{id}")
    public ResponseEntity<DtoCategory> updateCategory(@PathVariable Integer id,
                                                      @RequestBody DtoCategoryIU iu,
                                                      @RequestHeader("Authorization") String authHeader) {
        Integer userId = getUserFromToken(authHeader);
        return ResponseEntity.ok(categoryService.updateCategory(id, userId, iu));
    }
}

package ExpenseTrackerApp.expensetrackerapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "category")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "description")
    private String decsription;
    @Column(name = "description_2")
    private String description2;


    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Wallet wallet;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Expense> expense;



}

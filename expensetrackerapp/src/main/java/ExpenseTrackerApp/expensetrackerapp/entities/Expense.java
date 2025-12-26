package ExpenseTrackerApp.expensetrackerapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "expense")

@NoArgsConstructor
@AllArgsConstructor
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id ;
    @Column(name = "expense")
    private double expense;
    private LocalDateTime date;



    @ManyToOne(fetch =FetchType.LAZY)
    private Category category;

}

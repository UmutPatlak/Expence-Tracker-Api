package ExpenseTrackerApp.expensetrackerapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "_address")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "neighbourhood",nullable = false)
    private String neighbourhood;
    @Column(name = "no",nullable = false)
    private String no;
    @Column(name = "city",nullable = false)
    private String city;
    @Column(name = "country",nullable =false)
    private String country;
    @Column(name = "street",nullable = false)
    private String street;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user ;

}

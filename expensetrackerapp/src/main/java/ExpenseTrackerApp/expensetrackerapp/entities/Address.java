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
    private int id;
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


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private User user;


}

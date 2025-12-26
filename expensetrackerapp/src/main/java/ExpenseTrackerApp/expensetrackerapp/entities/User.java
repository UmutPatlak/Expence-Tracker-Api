package ExpenseTrackerApp.expensetrackerapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "_user")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User  {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
   @Column(name = "firstName", nullable = false)
   private String firstName;
   @Column(name = "lastName",nullable = false)
    private String lastName;
   @Column(name = "fullName",nullable = false)
    private String fullName;
   @Column(name = "email",nullable = false)
    private String email;
   @Column(name = "password", nullable = false)
    private String password;


    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
   private Address address;


    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Wallet wallet ;



    }


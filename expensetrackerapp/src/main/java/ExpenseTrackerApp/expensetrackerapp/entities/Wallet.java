package ExpenseTrackerApp.expensetrackerapp.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "_wallet")

@NoArgsConstructor
@AllArgsConstructor
public class Wallet {
        @Id
        @Getter
        @Setter
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id ;
            @Getter
            @Setter
            @Column(name = "wage")
        private double wage;
             @Getter
            @Setter
            @Column(name = "debt")
        private double debt; //borc
         @Getter
         @Setter
        @Column(name = "account")
        private double account;
         @Getter
         @Setter

         @Column(name = "date_now")
         private LocalDateTime dateNow;
         @Getter
           @Setter
          @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
          private List<Category> category;
    @Getter
    @Setter
         @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
         private User user;




}

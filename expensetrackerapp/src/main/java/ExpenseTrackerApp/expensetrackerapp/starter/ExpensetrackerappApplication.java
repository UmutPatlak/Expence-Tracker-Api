package ExpenseTrackerApp.expensetrackerapp.starter;

import jakarta.persistence.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.awt.*;
import java.net.URI;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "ExpenseTrackerApp.expensetrackerapp.repositories")
@EntityScan(basePackages = "ExpenseTrackerApp.expensetrackerapp.entities")
@ComponentScan(basePackages = "ExpenseTrackerApp.expensetrackerapp")

public class ExpensetrackerappApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpensetrackerappApplication.class, args);
    }

    @Bean
    public ApplicationRunner openSwagger() {
        return args -> {
            try {
                if (!GraphicsEnvironment.isHeadless()) {
                    Desktop.getDesktop().browse(new URI("http://localhost:8080/swagger-ui.html"));
                } else {
                    System.out.println("Swagger manuel aç: http://localhost:8080/swagger-ui.html");
                }
            } catch (Exception e) {
                System.out.println("Tarayıcı açılamadı, linke tıkla: http://localhost:8080/swagger-ui.html");
            }
        };
    }
}

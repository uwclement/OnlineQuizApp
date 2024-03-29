package auca.onlinequizapp;

import auca.onlinequizapp.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class OnlineQuizAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineQuizAppApplication.class, args);
    }

}

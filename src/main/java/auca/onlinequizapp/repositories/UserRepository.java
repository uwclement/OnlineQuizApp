package auca.onlinequizapp.repositories;
import auca.onlinequizapp.models.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
public interface UserRepository extends JpaRepository<User,Long> {
        User findByUsername(String username);
        User findByEmail(String email);

        User findAllBy();
}

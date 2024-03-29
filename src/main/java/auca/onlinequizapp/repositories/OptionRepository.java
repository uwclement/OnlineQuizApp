package auca.onlinequizapp.repositories;

import auca.onlinequizapp.models.Option;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends JpaRepository<Option,Long> {
}

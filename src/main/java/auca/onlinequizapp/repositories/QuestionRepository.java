package auca.onlinequizapp.repositories;

import auca.onlinequizapp.models.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Questions,Long> {
}

package auca.onlinequizapp.repositories;

import auca.onlinequizapp.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz,Long> {
}

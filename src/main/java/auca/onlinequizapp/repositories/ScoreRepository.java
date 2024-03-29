package auca.onlinequizapp.repositories;

import auca.onlinequizapp.models.Quiz;
import auca.onlinequizapp.models.Score;
import auca.onlinequizapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long> {
    Score findByUserAndQuiz(User user, Quiz quiz);
}

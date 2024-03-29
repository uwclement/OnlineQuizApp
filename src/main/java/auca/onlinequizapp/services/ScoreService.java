package auca.onlinequizapp.services;

import auca.onlinequizapp.models.Quiz;
import auca.onlinequizapp.models.Score;
import auca.onlinequizapp.models.User;
import auca.onlinequizapp.repositories.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    public void saveScore(Score score) {
        scoreRepository.save(score);
    }

    public Score getScoreByUserAndQuiz(User user, Quiz quiz) {
        return scoreRepository.findByUserAndQuiz(user, quiz);
    }
}

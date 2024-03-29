package auca.onlinequizapp.services;


import auca.onlinequizapp.models.Option;
import auca.onlinequizapp.models.Questions;
import auca.onlinequizapp.models.Quiz;
import auca.onlinequizapp.repositories.OptionRepository;
import auca.onlinequizapp.repositories.QuestionRepository;
import auca.onlinequizapp.repositories.QuizRepository;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private OptionRepository optionRepository;

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public Quiz getQuizById(Long id) {
        return quizRepository.findById(id).orElse(null);
    }

    public void createQuiz(Quiz quiz) {
        quizRepository.save(quiz);
    }

    public void updateQuiz(Long quizId, Quiz updatedQuiz) {
        Quiz quiz = quizRepository.findById(quizId).orElse(null);
        if (quiz != null) {
            quiz.setTitle(updatedQuiz.getTitle());
            quiz.setDuration(updatedQuiz.getDuration());
            quizRepository.save(quiz);
        }
    }

    public int calculateScore(Quiz quiz, List<Long> answers) {
        int score = 0;
        List<Questions> questions = quiz.getQuestions();
        for (int i = 0; i < questions.size(); i++) {
            Questions question = questions.get(i);
            Long selectedOptionId = answers.get(i);
            Option selectedOption = optionRepository.findById(selectedOptionId).orElse(null);
            if (selectedOption != null && selectedOption.isCorrect()) {
                score++;
            }
        }
        return score;
    }
}

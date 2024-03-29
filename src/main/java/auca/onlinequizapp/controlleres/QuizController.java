package auca.onlinequizapp.controlleres;

import auca.onlinequizapp.models.Quiz;
import auca.onlinequizapp.models.Score;
import auca.onlinequizapp.models.User;
import auca.onlinequizapp.services.QuizService;
import auca.onlinequizapp.services.ScoreService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class QuizController {

    @Autowired
    private QuizService quizService;

    @Autowired
    private ScoreService scoreService;

    @GetMapping("/quizzes")
    public String showQuizList(Model model, HttpSession session) {
        User user = (User) session.getAttribute("user");
        List<Quiz> quizzes = quizService.getAllQuizzes();
        model.addAttribute("quizzes", quizzes);
        model.addAttribute("user", user);
        return "quiz-list";
    }

    @GetMapping("/quiz/{quizId}")
    public String showQuiz(@PathVariable Long quizId, Model model, HttpSession session) {
        Quiz quiz = quizService.getQuizById(quizId);
        model.addAttribute("quiz", quiz);
        session.setAttribute("currentQuiz", quiz);
        return "take-quiz";
    }

    @PostMapping("/quiz/{quizId}/submit")
    public String submitQuiz(@PathVariable Long quizId, @RequestParam List<Long> answers, HttpSession session) {
        User user = (User) session.getAttribute("user");
        Quiz quiz = (Quiz) session.getAttribute("currentQuiz");
        int score = quizService.calculateScore(quiz, answers);
        Score userScore = new Score(user, quiz, score);
        scoreService.saveScore(userScore);
        return "redirect:/quiz/" + quizId + "/result";
    }

    @GetMapping("/quiz/{quizId}/result")
    public String showQuizResult(@PathVariable Long quizId, Model model, HttpSession session) {
        User user = (User) session.getAttribute("user");
        Quiz quiz = (Quiz) session.getAttribute("currentQuiz");
        Score userScore = scoreService.getScoreByUserAndQuiz(user, quiz);
        model.addAttribute("userScore", userScore);
        return "quiz-result";
    }

}

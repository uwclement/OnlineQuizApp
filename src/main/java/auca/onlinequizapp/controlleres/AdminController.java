package auca.onlinequizapp.controlleres;


import auca.onlinequizapp.models.Quiz;
import auca.onlinequizapp.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/admin/quizzes")
    public String showAdminQuizList(Model model) {
        List<Quiz> quizzes = quizService.getAllQuizzes();
        model.addAttribute("quizzes", quizzes);
        return "admin-quizzes";
    }

    @GetMapping("/admin/quiz/create")
    public String showCreateQuizForm(Model model) {
        model.addAttribute("quiz", new Quiz());
        return "admin-quiz-form";
    }

    @PostMapping("/admin/quiz/create")
    public String createQuiz(@ModelAttribute Quiz quiz) {
        quizService.createQuiz(quiz);
        return "redirect:/admin/quizzes";
    }

    @GetMapping("/admin/quiz/{quizId}/edit")
    public String showEditQuizForm(@PathVariable Long quizId, Model model) {
        Quiz quiz = quizService.getQuizById(quizId);
        model.addAttribute("quiz", quiz);
        return "admin-quiz-form";
    }

    @PostMapping("/admin/quiz/{quizId}/edit")
    public String updateQuiz(@PathVariable Long quizId, @ModelAttribute Quiz quiz) {
        quizService.updateQuiz(quizId, quiz);
        return "redirect:/admin/quizzes";
    }


}

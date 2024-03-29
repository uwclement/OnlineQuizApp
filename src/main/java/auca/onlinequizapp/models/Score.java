package auca.onlinequizapp.models;

import jakarta.persistence.*;
@Entity
@Table( name = "scores")
public class Score {
    @Id
    @GeneratedValue (strategy =  GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn( name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn( name = "quiz_id")
    private Quiz quiz;
    private int score;

    public Score(User user, Quiz quiz, int score) {
    }

    public Score(Long id) {
        this.id = id;
    }

    public Score(Long id, User user, Quiz quiz, int score) {
        this.id = id;
        this.user = user;
        this.quiz = quiz;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

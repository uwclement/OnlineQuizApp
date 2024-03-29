package auca.onlinequizapp.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.*;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.Set;
@Entity
@Table( name = "quizzes")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Title;
    private int duration;//in minuntes
   @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private List<Questions> questions;

    public Quiz() {
    }

    public Quiz(Long id) {
        this.id = id;
    }

    public Quiz(Long id, String title, int duration, List<Questions> questions) {
        this.id = id;
        Title = title;
        this.duration = duration;
        this.questions = questions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }
}

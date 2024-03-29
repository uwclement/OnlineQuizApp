package auca.onlinequizapp.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;
@Entity
@Table(name = "questions")
public class Questions {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;

    @ManyToOne
    @JoinColumn( name = "quiz_id")
    private Quiz quiz;
   @OneToMany(mappedBy = "questions", cascade = CascadeType.ALL)
    private List<Option> options;

    public Questions() {
    }

    public Questions(Long id) {
        this.id = id;
    }

    public Questions(Long id, String text, Quiz quiz, List<Option> options) {
        this.id = id;
        this.text = text;
        this.quiz = quiz;
        this.options = options;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}

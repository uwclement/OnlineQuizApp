package auca.onlinequizapp.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Score> scores;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public User(Long id, String username, String email, String password, Set<Score> scores) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.scores = scores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Score> getScores() {
        return scores;
    }

    public void setScores(Set<Score> scores) {
        this.scores = scores;
    }
}


package org.telusko.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "player_scores")
public class PlayerScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int score;

    private LocalDateTime completionTime;

    @ManyToOne
    @JoinColumn(name = "username")
    private User user;

    @ManyToOne
    @JoinColumn(name = "tech_stack_id")
    private TechStack techStack;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TechStack getTechStack() {
        return techStack;
    }

    public void setTechStack(TechStack techStack) {
        this.techStack = techStack;
    }

    public LocalDateTime getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(LocalDateTime completionTime) {
        this.completionTime = completionTime;
    }
}

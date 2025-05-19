package org.example.gestiontournoismvc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "player_score")
public class PlayerScore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private Player player;

    private int score;

    @ManyToOne
    private Score scoreRef;

    public PlayerScore() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Score getScoreRef() {
        return scoreRef;
    }

    public void setScoreRef(Score scoreRef) {
        this.scoreRef = scoreRef;
    }
}
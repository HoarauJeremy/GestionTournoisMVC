package org.example.gestiontournoismvc.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Map;

@Entity
@Table(name = "score")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(mappedBy = "scoreRef", cascade = CascadeType.ALL)
    private List<PlayerScore> playerScores;

    @ManyToOne
    @JoinColumn(name = "winner_id")
    private Player winner;

    private Boolean forfeit;

    public Score() {}

    public Score(Long id, List<PlayerScore> playerScores, Player winner, Boolean forfeit) {
        this.id = id;
        this.playerScores = playerScores;
        this.winner = winner;
        this.forfeit = forfeit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<PlayerScore> getPlayerScores() {
        return playerScores;
    }

    public void setPlayerScores(List<PlayerScore> playerScores) {
        this.playerScores = playerScores;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Boolean getForfeit() {
        return forfeit;
    }

    public void setForfeit(Boolean forfeit) {
        this.forfeit = forfeit;
    }
}
package org.example.gestiontournoismvc.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "game_mode")
public class GameMode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String description;
    private int minPlayers;
    private int maxPlayers;
    private int scoreToWin;

    @ManyToOne
    private Game game;

    @OneToMany(mappedBy = "gamemode")
    private List<Tournois> tournois;

    public GameMode() {}

    public GameMode(String name, String description, int minPlayers, int maxPlayers, int scoreToWin, Game game) {
        this.name = name;
        this.description = description;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.scoreToWin = scoreToWin;
        this.game = game;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public int getScoreToWin() {
        return scoreToWin;
    }

    public void setScoreToWin(int scoreToWin) {
        this.scoreToWin = scoreToWin;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public List<Tournois> getTournois() {
        return tournois;
    }

    public void setTournois(List<Tournois> tournois) {
        this.tournois = tournois;
    }
}
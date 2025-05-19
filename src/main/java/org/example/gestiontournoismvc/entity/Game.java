package org.example.gestiontournoismvc.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private GameFormat gameFormat;

    private Integer averageMatchDuration;

    @OneToMany(mappedBy = "game")
    List<GameMode> availableModes;

    public Game() {}

    public Game(String name, String description, GameFormat gameFormat, Integer averageMatchDuration) {
        this.name = name;
        this.description = description;
        this.gameFormat = gameFormat;
        this.averageMatchDuration = averageMatchDuration;
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

    public GameFormat getGameFormat() {
        return gameFormat;
    }

    public void setGameFormat(GameFormat gameFormat) {
        this.gameFormat = gameFormat;
    }

    public Integer getAverageMatchDuration() {
        return averageMatchDuration;
    }

    public void setAverageMatchDuration(Integer averageMatchDuration) {
        this.averageMatchDuration = averageMatchDuration;
    }

    public List<GameMode> getAvailableModes() {
        return availableModes;
    }

    public void setAvailableModes(List<GameMode> availableModes) {
        this.availableModes = availableModes;
    }
}
package org.example.gestiontournoismvc.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Player extends User {

    private String nickName;
    private int eloRating;

//    private Map<Game, PlayerStats> statistics;

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PlayerStats> statistics = new ArrayList<>();

    @ManyToMany
    private List<Match> matches;

    public Player() {}

    public Player(String nickName, int eloRating) {
        this.nickName = nickName;
        this.eloRating = eloRating;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getEloRating() {
        return eloRating;
    }

    public void setEloRating(int eloRating) {
        this.eloRating = eloRating;
    }

    /*public Map<Game, PlayerStats> getStatistics() {
        return statistics;
    }

    public void setStatistics(Map<Game, PlayerStats> statistics) {
        this.statistics = statistics;
    }*/

    public List<PlayerStats> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<PlayerStats> statistics) {
        this.statistics = statistics;
    }
}
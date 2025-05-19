package org.example.gestiontournoismvc.entity;

import jakarta.persistence.Entity;

@Entity
public class RoundRobin extends Tournois {

    private int numberOfRounds;
    private Boolean homeAndAway;

    public RoundRobin() {}

    public RoundRobin(int numberOfRounds, Boolean homeAndAway) {
        super();
        this.numberOfRounds = numberOfRounds;
        this.homeAndAway = homeAndAway;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    public Boolean getHomeAndAway() {
        return homeAndAway;
    }

    public void setHomeAndAway(Boolean homeAndAway) {
        this.homeAndAway = homeAndAway;
    }
}
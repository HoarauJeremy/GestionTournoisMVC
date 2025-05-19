package org.example.gestiontournoismvc.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Tournois implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nom;

    private LocalDateTime date_debut;

    private LocalDateTime date_fin;

    @Enumerated(EnumType.STRING)
    private TournoisStatut statut;

    @ManyToOne
    private Game game;

    @ManyToOne
    private GameMode gamemode;

    private int maxParticipants;

    @OneToMany(mappedBy = "tournois")
    private List<Match> matches;

    public Tournois() {}

    public Tournois(Long id, String nom, LocalDateTime date_debut, LocalDateTime date_fin, TournoisStatut statut, Game game, GameMode gamemode, int maxParticipants, List<Match> matches) {
        this.id = id;
        this.nom = nom;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.statut = statut;
        this.game = game;
        this.gamemode = gamemode;
        this.maxParticipants = maxParticipants;
        this.matches = matches;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDateTime getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(LocalDateTime date_debut) {
        this.date_debut = date_debut;
    }

    public LocalDateTime getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(LocalDateTime date_fin) {
        this.date_fin = date_fin;
    }

    public TournoisStatut getStatut() {
        return statut;
    }

    public void setStatut(TournoisStatut statut) {
        this.statut = statut;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameMode getGamemode() {
        return gamemode;
    }

    public void setGamemode(GameMode gamemode) {
        this.gamemode = gamemode;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
}
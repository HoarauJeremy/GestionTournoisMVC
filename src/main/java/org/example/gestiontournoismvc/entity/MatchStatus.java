package org.example.gestiontournoismvc.entity;

public enum MatchStatus {
    SCHEDULED,        // Le match est prévu, avec une date/heure définie
    ONGOING,          // Le match est en cours
    WAITING_RESULT,   // Match terminé mais résultat non encore validé (attente validation arbitre)
    COMPLETED,        // Le match est terminé et validé
    FORFEIT,          // L’un des joueurs/équipes a déclaré forfait
    DISPUTED,         // Le match est en litige (contestation du score ou triche)
    CANCELLED         // Le match a été annulé (erreur ou désistement)
}

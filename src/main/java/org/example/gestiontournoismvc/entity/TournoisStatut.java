package org.example.gestiontournoismvc.entity;

public enum TournoisStatut {
    DRAFT,            // Le tournoi est en cours de création, non encore publié
    OPEN,             // Ouvert aux inscriptions
    FULL,             // Nombre maximal de participants atteint
    IN_PROGRESS,      // Tournoi lancé, matchs en cours
    COMPLETED,        // Tous les matchs sont terminés et les résultats validés
    CANCELLED,        // Tournoi annulé par l'organisateur
    ARCHIVED          // Tournoi terminé et archivé (lecture seule)
}

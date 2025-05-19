package org.example.gestiontournoismvc.entity;

import jakarta.persistence.Entity;

@Entity
public class DoubleElimination extends Tournois {

    private Boolean hasConsolationFinal;

    public DoubleElimination() {}

    public DoubleElimination(Long id, Boolean hasConsolationFinal) {
        super();

        this.hasConsolationFinal = hasConsolationFinal;
    }

    public Boolean getHasConsolationFinal() {
        return hasConsolationFinal;
    }

    public void setHasConsolationFinal(Boolean hasConsolationFinal) {
        this.hasConsolationFinal = hasConsolationFinal;
    }
}
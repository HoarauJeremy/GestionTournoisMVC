package org.example.gestiontournoismvc.entity;

import jakarta.persistence.Entity;

@Entity
public class SimpleElimination extends Tournois {

    private Boolean hasThirdPlaceMatch;

    public SimpleElimination() {
        super();
    }

    public SimpleElimination(Boolean hasThirdPlaceMatch) {
        super();
        this.hasThirdPlaceMatch = hasThirdPlaceMatch;
    }

    public Boolean getHasThirdPlaceMatch() {
        return hasThirdPlaceMatch;
    }

    public void setHasThirdPlaceMatch(Boolean thirdPlaceMatch) {
        this.hasThirdPlaceMatch = thirdPlaceMatch;
    }
}

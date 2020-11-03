package com.accenture.gama.viajei.entities;

import com.accenture.gama.viajei.entities.enuns.TravelerType;

public class Traveler {
    private Integer id;
    private TravelerType travelerType;

    public Integer getId() {
        return id;
    }

    public TravelerType getTravelerType() {
        return travelerType;
    }

    public void setTravelerType(TravelerType travelerType) {
        this.travelerType = travelerType;
    }

    
}

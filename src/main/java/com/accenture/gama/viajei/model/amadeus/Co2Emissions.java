package com.accenture.gama.viajei.model.amadeus;

import com.accenture.gama.viajei.model.amadeus.enuns.CabinType;

public class Co2Emissions {
    private int weight;
    private String weightUnit;
    private CabinType cabin;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public CabinType getCabin() {
        return cabin;
    }

    public void setCabin(CabinType cabin) {
        this.cabin = cabin;
    }

    
}

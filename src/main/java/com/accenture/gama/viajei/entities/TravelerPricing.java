package com.accenture.gama.viajei.entities;

import com.accenture.gama.viajei.entities.enuns.TravelerType;

public class TravelerPricing {
    private int travelerId;
    private String fareOption;
    private TravelerType travelerType;
    private SearchPrice price;
    private FareDetailsBySegment[] fareDetailsBySegment;

    public int getTravelerId() {
        return travelerId;
    }

    public void setTravelerId(int travelerId) {
        this.travelerId = travelerId;
    }

    public String getFareOption() {
        return fareOption;
    }

    public void setFareOption(String fareOption) {
        this.fareOption = fareOption;
    }

    public TravelerType getTravelerType() {
        return travelerType;
    }

    public void setTravelerType(TravelerType travelerType) {
        this.travelerType = travelerType;
    }

    public SearchPrice getPrice() {
        return price;
    }

    public void setPrice(SearchPrice price) {
        this.price = price;
    }

    public FareDetailsBySegment[] getFareDetailsBySegment() {
        return fareDetailsBySegment;
    }

    public void setFareDetailsBySegment(FareDetailsBySegment[] fareDetailsBySegment) {
        this.fareDetailsBySegment = fareDetailsBySegment;
    }

    
}

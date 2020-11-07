package com.accenture.gama.viajei.models.amadeus;

import javax.validation.constraints.NotNull;

import com.accenture.gama.viajei.models.amadeus.enuns.TravelerType;


public class TravelerPricing {
    @NotNull(message = "Traveler id are required")
    private int travelerId;
    @NotNull(message = "Fare Option are required")
    private String fareOption;
    @NotNull(message = "Traveler type are required")
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

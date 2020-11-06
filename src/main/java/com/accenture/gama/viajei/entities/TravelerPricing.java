package com.accenture.gama.viajei.entities;

public class TravelerPricing {
    private Integer travelerId;
    private String fareOption;
    private String travelerType;
    private SearchPrice price;
    private FareDetailsBySegment[] fareDetailsBySegment;

    public Integer getTravelerId() {
        return travelerId;
    }

    public void setTravelerId(Integer travelerId) {
        this.travelerId = travelerId;
    }

    public String getFareOption() {
        return fareOption;
    }

    public void setFareOption(String fareOption) {
        this.fareOption = fareOption;
    }

    public String getTravelerType() {
        return travelerType;
    }

    public void setTravelerType(String travelerType) {
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

package com.accenture.gama.viajei.model.amadeus;
public class SearchSegment {
    private AirportInfo departure;
    private AirportInfo arrival;
    private String carrierCode;
    private String number;
    private Aircraft aircraft;
    private String duration;
    private String id;
    private int numberOfStops;
    private boolean blacklistedInEU;
    private Co2Emissions[] co2Emissions;

    public AirportInfo getDeparture() {
        return departure;
    }

    public void setDeparture(AirportInfo departure) {
        this.departure = departure;
    }

    public AirportInfo getArrival() {
        return arrival;
    }

    public void setArrival(AirportInfo arrival) {
        this.arrival = arrival;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumberOfStops() {
        return numberOfStops;
    }

    public void setNumberOfStops(int numberOfStops) {
        this.numberOfStops = numberOfStops;
    }

    public boolean isBlacklistedInEU() {
        return blacklistedInEU;
    }

    public void setBlacklistedInEU(boolean blacklistedInEU) {
        this.blacklistedInEU = blacklistedInEU;
    }

    public Co2Emissions[] getCo2Emissions() {
        return co2Emissions;
    }

    public void setCo2Emissions(Co2Emissions[] co2Emissions) {
        this.co2Emissions = co2Emissions;
    }

    
}

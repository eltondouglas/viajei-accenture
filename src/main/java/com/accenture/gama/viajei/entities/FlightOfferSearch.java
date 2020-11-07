package com.accenture.gama.viajei.entities;

import com.accenture.gama.viajei.entities.enuns.FlightOfferSource;

public class FlightOfferSearch {
    private String type;
    private String id;
    private FlightOfferSource source;
    private boolean instantTicketingRequired;
    private boolean nonHomogeneous;
    private boolean oneWay;
    private String lastTicketingDate;
    private int numberOfBookableSeats;
    private Itinerary[] itineraries;
    private SearchPrice price;
    private PricingOptions pricingOptions;
    private String[] validatingAirlineCodes;
    private TravelerPricing[] travelerPricings;
    private String choiceProbability;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlightOfferSource getSource() {
        return source;
    }

    public void setSource(FlightOfferSource source) {
        this.source = source;
    }

    public boolean isInstantTicketingRequired() {
        return instantTicketingRequired;
    }

    public void setInstantTicketingRequired(boolean instantTicketingRequired) {
        this.instantTicketingRequired = instantTicketingRequired;
    }

    public boolean isNonHomogeneous() {
        return nonHomogeneous;
    }

    public void setNonHomogeneous(boolean nonHomogeneous) {
        this.nonHomogeneous = nonHomogeneous;
    }

    public boolean isOneWay() {
        return oneWay;
    }

    public void setOneWay(boolean oneWay) {
        this.oneWay = oneWay;
    }

    public String getLastTicketingDate() {
        return lastTicketingDate;
    }

    public void setLastTicketingDate(String lastTicketingDate) {
        this.lastTicketingDate = lastTicketingDate;
    }

    public int getNumberOfBookableSeats() {
        return numberOfBookableSeats;
    }

    public void setNumberOfBookableSeats(int numberOfBookableSeats) {
        this.numberOfBookableSeats = numberOfBookableSeats;
    }

    public Itinerary[] getItineraries() {
        return itineraries;
    }

    public void setItineraries(Itinerary[] itineraries) {
        this.itineraries = itineraries;
    }

    public SearchPrice getPrice() {
        return price;
    }

    public void setPrice(SearchPrice price) {
        this.price = price;
    }

    public PricingOptions getPricingOptions() {
        return pricingOptions;
    }

    public void setPricingOptions(PricingOptions pricingOptions) {
        this.pricingOptions = pricingOptions;
    }

    public String[] getValidatingAirlineCodes() {
        return validatingAirlineCodes;
    }

    public void setValidatingAirlineCodes(String[] validatingAirlineCodes) {
        this.validatingAirlineCodes = validatingAirlineCodes;
    }

    public TravelerPricing[] getTravelerPricings() {
        return travelerPricings;
    }

    public void setTravelerPricings(TravelerPricing[] travelerPricings) {
        this.travelerPricings = travelerPricings;
    }

    public String getChoiceProbability() {
        return choiceProbability;
    }

    public void setChoiceProbability(String choiceProbability) {
        this.choiceProbability = choiceProbability;
    }
}

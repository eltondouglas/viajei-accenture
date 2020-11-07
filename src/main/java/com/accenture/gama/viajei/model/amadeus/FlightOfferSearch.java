package com.accenture.gama.viajei.model.amadeus;

import javax.validation.constraints.NotNull;

import com.accenture.gama.viajei.model.amadeus.enuns.FlightOfferSource;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(subTypes = com.amadeus.shopping.FlightOffers.class)
public class FlightOfferSearch {
    @NotNull(message = "Type are required")
    private String type = "flight-offer";
    @NotNull(message = "Id are required")
    private String id;
    @NotNull(message = "Source are required")
    private FlightOfferSource source;
    private boolean instantTicketingRequired;
    private boolean nonHomogeneous;
    @ApiModelProperty(name = "If true, the flight offer fulfills only one originDestination and has to be combined with other oneWays to complete the whole journey.")
    private boolean oneWay;
    private String lastTicketingDate;
    private int numberOfBookableSeats;
    @NotNull(message = "Itineraries are required")
    private Itinerary[] itineraries;
    private SearchPrice price;
    private PricingOptions pricingOptions;
    private String[] validatingAirlineCodes;
    private TravelerPricing[] travelerPricings;
    private String choiceProbability;

    public String getType() {
        return type;
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

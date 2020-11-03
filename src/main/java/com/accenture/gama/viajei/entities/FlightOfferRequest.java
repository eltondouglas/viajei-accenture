package com.accenture.gama.viajei.entities;

import java.util.Arrays;
import java.util.List;


public class FlightOfferRequest {
    private Long id;
    private String currencyCode;
    private List<OriginDestination> originDestinations;
    private List<Traveler> travelers;
    private List<String> sources;
    private SearchCriteria searchCriteria;

    public FlightOfferRequest() {
        this.sources = Arrays.asList("GDS");
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public List<OriginDestination> getOriginDestinations() {
        return originDestinations;
    }

    public void setOriginDestinations(List<OriginDestination> originDestinations) {
        this.originDestinations = originDestinations;
    }

    public List<Traveler> getTravelers() {
        return travelers;
    }

    public void setTravelers(List<Traveler> travelers) {
        this.travelers = travelers;
    }

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(SearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public Long getId() {
        return id;
    }
}

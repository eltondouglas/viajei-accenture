package com.accenture.gama.viajei.entities;

import java.util.Arrays;
import java.util.List;

import com.accenture.gama.viajei.entities.enuns.CurrencyCode;


public class FlightOfferRequest {
    private CurrencyCode currencyCode;
    private List<OriginDestination> originDestinations;
    private List<Traveler> travelers;
    private List<String> sources;
    private SearchCriteria searchCriteria;

    public FlightOfferRequest() {
        this.sources = Arrays.asList("GDS");
    }

    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(CurrencyCode currencyCode) {
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
}

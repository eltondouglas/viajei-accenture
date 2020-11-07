package com.accenture.gama.viajei.models.amadeus;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.accenture.gama.viajei.models.amadeus.enuns.CurrencyCode;
import com.accenture.gama.viajei.models.amadeus.enuns.FlightOfferSource;



public class FlightOfferSearchRequest {
    private CurrencyCode currencyCode;
    @NotNull(message = "Origin Destination are required")
    private List<OriginDestination> originDestinations;
    @NotNull(message = "Travelers are mandatory")
    private List<TravelerRequest> travelers;
    @NotNull(message = "Sources are required")
    private List<FlightOfferSource> sources;
    private SearchCriteria searchCriteria;
    

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

    public List<TravelerRequest> getTravelers() {
        return travelers;
    }

    public void setTravelers(List<TravelerRequest> travelers) {
        this.travelers = travelers;
    }

    public List<FlightOfferSource> getSources() {
        return sources;
    }

    public void setSources(List<FlightOfferSource> sources) {
        this.sources = sources;
    }

    public SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(SearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }
}

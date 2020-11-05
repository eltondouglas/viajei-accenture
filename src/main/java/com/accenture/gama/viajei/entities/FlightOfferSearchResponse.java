package com.accenture.gama.viajei.entities;

import com.amadeus.resources.FlightOfferSearch;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = {"response"})
public class FlightOfferSearchResponse extends FlightOfferSearch {

}

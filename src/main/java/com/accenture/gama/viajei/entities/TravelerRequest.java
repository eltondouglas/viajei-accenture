package com.accenture.gama.viajei.entities;

import com.amadeus.resources.Traveler;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(value = {"response"})
public class TravelerRequest extends Traveler {

}

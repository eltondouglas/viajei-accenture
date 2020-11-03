package com.accenture.gama.viajei.entities;

public class OriginDestination {
    private Integer id;
    private String originLocationCode;
    private String destinationLocationCode;
    private DepartureDateTimeRange departureDateTimeRange;

    public Integer getId() {
        return id;
    }
    
    public String getOriginLocationCode() {
        return originLocationCode;
    }

    public void setOriginLocationCode(String originLocationCode) {
        this.originLocationCode = originLocationCode;
    }

    public String getDestinationLocationCode() {
        return destinationLocationCode;
    }

    public void setDestinationLocationCode(String destinationLocationCode) {
        this.destinationLocationCode = destinationLocationCode;
    }

    public DepartureDateTimeRange getDepartureDateTimeRange() {
        return departureDateTimeRange;
    }

    public void setDepartureDateTimeRange(DepartureDateTimeRange departureDateTimeRange) {
        this.departureDateTimeRange = departureDateTimeRange;
    }

    
}

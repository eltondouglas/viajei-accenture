package com.accenture.gama.viajei.model.amadeus;

public class OriginDestination {
    private String id;
    private String originLocationCode;
    private String destinationLocationCode;
    private DepartureDateTimeRange departureDateTimeRange;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

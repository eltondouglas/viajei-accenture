package com.accenture.gama.viajei.models.amadeus;

import javax.validation.constraints.NotNull;

public class Itinerary {
    private String duration;
    @NotNull(message = "Segments are required")
    private SearchSegment[] segments;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public SearchSegment[] getSegments() {
        return segments;
    }

    public void setSegments(SearchSegment[] segments) {
        this.segments = segments;
    }
    

}
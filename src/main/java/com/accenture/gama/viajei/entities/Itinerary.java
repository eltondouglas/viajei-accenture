package com.accenture.gama.viajei.entities;

public class Itinerary {
    private String duration;
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
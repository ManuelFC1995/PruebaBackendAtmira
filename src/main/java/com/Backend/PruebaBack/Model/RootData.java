package com.Backend.PruebaBack.Model;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

//CLASE PADRE DE LOS DATOS DEL JSON
public class RootData {
    private Links links;
    private long elementCount;
    private Map<String, List<NearEarthObjects>> nearEarthObjects;

    public RootData(Links links, long elementCount, Map<String, List<NearEarthObjects>> nearEarthObjects) {
        this.links = links;
        this.elementCount = elementCount;
        this.nearEarthObjects = nearEarthObjects;
    }

    public RootData() {
    }

    @JsonProperty("links")
    public Links getLinks() { return links; }
    @JsonProperty("links")
    public void setLinks( Links value) { this.links = value; }

    @JsonProperty("element_count")
    public long getElementCount() { return elementCount; }
    @JsonProperty("element_count")
    public void setElementCount(long value) { this.elementCount = value; }

    @JsonProperty("near_earth_objects")
    public Map<String, List<NearEarthObjects>> getNearEarthObjects() { return nearEarthObjects; }
    @JsonProperty("near_earth_objects")
    public void setNearEarthObjects( Map<String, List<NearEarthObjects>> value) { this.nearEarthObjects = value; }

}

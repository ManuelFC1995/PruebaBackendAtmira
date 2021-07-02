package com.Backend.PruebaBack.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EstimatedDiameter {
    private Kilometers kilometers;
    private Kilometers meters;
    private Kilometers miles;
    private Kilometers feet;

    @JsonProperty("kilometers")
    public Kilometers getKilometers() { return kilometers; }
    @JsonProperty("kilometers")
    public void setKilometers(Kilometers value) { this.kilometers = value; }

    @JsonProperty("meters")
    public Kilometers getMeters() { return meters; }
    @JsonProperty("meters")
    public void setMeters(Kilometers value) { this.meters = value; }

    @JsonProperty("miles")
    public Kilometers getMiles() { return miles; }
    @JsonProperty("miles")
    public void setMiles(Kilometers value) { this.miles = value; }

    @JsonProperty("feet")
    public Kilometers getFeet() { return feet; }
    @JsonProperty("feet")
    public void setFeet(Kilometers value) { this.feet = value; }


}
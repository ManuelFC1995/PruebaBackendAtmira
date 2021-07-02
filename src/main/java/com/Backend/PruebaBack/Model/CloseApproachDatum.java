package com.Backend.PruebaBack.Model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CloseApproachDatum {

    private String closeApproachDate;
    private String closeApproachDateFull;
    private RelativeVelocity relativeVelocity;
    private String  orbitingBody;
    private long epochDateCloseApproach;
    private MissDistance missDistance;

    public CloseApproachDatum() {
    }

    @JsonProperty("close_approach_date")
    public String getCloseApproachDate() { return closeApproachDate; }
    @JsonProperty("close_approach_date")
    public void setCloseApproachDate(String value) { this.closeApproachDate = value; }


    @JsonProperty("relative_velocity")
    public RelativeVelocity getRelativeVelocity() { return relativeVelocity; }
    @JsonProperty("relative_velocity")
    public void setRelativeVelocity(RelativeVelocity value) { this.relativeVelocity = value; }

    @JsonProperty("miss_distance")
    public MissDistance getMissDistance() { return missDistance; }
    @JsonProperty("miss_distance")
    public void setMissDistance(MissDistance value) { this.missDistance = value; }

    @JsonProperty("epoch_date_close_approach")
    public long getEpochDateCloseApproach() { return epochDateCloseApproach; }
    @JsonProperty("epoch_date_close_approach")
    public void setEpochDateCloseApproach(long value) { this.epochDateCloseApproach = value; }

    @JsonProperty("orbiting_body")
    public String getOrbitingBody() { return orbitingBody; }
    @JsonProperty("orbiting_body")
    public void setOrbitingBody(String value) { this.orbitingBody = value; }

    @JsonProperty("close_approach_date_full")
    public String getCloseApproachDateFull() { return closeApproachDateFull; }
    @JsonProperty("close_approach_date_full")
    public void setCloseApproachDateFull(String value) { this.closeApproachDateFull = value; }

}
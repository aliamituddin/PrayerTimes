package com.example.prayerTimes.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Params {
    @SerializedName("Fajr")
    @Expose
    private Double fajr;
    @SerializedName("Isha")
    @Expose
    private Double isha;

    public Double getFajr() {
        return this.fajr;
    }

    public void setFajr(Double num) {
        this.fajr = num;
    }

    public Double getIsha() {
        return this.isha;
    }

    public void setIsha(Double num) {
        this.isha = num;
    }
}

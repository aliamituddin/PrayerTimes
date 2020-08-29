package com.example.prayerTimes.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Offset {


    @SerializedName("Asr")
    @Expose
    private Integer asr;
    @SerializedName("Dhuhr")
    @Expose
    private Integer dhuhr;
    @SerializedName("Fajr")
    @Expose
    private Integer fajr;
    @SerializedName("Imsak")
    @Expose
    private Integer imsak;
    @SerializedName("Isha")
    @Expose
    private Integer isha;
    @SerializedName("Maghrib")
    @Expose
    private Integer maghrib;
    @SerializedName("Midnight")
    @Expose
    private Integer midnight;
    @SerializedName("Sunrise")
    @Expose
    private Integer sunrise;
    @SerializedName("Sunset")
    @Expose
    private Integer sunset;

    public Integer getImsak() {
        return this.imsak;
    }

    public void setImsak(Integer num) {
        this.imsak = num;
    }

    public Integer getFajr() {
        return this.fajr;
    }

    public void setFajr(Integer num) {
        this.fajr = num;
    }

    public Integer getSunrise() {
        return this.sunrise;
    }

    public void setSunrise(Integer num) {
        this.sunrise = num;
    }

    public Integer getDhuhr() {
        return this.dhuhr;
    }

    public void setDhuhr(Integer num) {
        this.dhuhr = num;
    }

    public Integer getAsr() {
        return this.asr;
    }

    public void setAsr(Integer num) {
        this.asr = num;
    }

    public Integer getMaghrib() {
        return this.maghrib;
    }

    public void setMaghrib(Integer num) {
        this.maghrib = num;
    }

    public Integer getSunset() {
        return this.sunset;
    }

    public void setSunset(Integer num) {
        this.sunset = num;
    }

    public Integer getIsha() {
        return this.isha;
    }

    public void setIsha(Integer num) {
        this.isha = num;
    }

    public Integer getMidnight() {
        return this.midnight;
    }

    public void setMidnight(Integer num) {
        this.midnight = num;
    }
}

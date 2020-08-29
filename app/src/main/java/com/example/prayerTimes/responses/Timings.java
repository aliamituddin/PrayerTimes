package com.example.prayerTimes.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Timings {
    @SerializedName("Asr")
    @Expose
    private String asr;
    @SerializedName("Dhuhr")
    @Expose
    private String dhuhr;
    @SerializedName("Fajr")
    @Expose
    private String fajr;
    @SerializedName("Imsak")
    @Expose
    private String imsak;
    @SerializedName("Isha")
    @Expose
    private String isha;
    @SerializedName("Maghrib")
    @Expose
    private String maghrib;
    @SerializedName("Midnight")
    @Expose
    private String midnight;
    @SerializedName("Sunrise")
    @Expose
    private String sunrise;
    @SerializedName("Sunset")
    @Expose
    private String sunset;

    public String getFajr() {
        return this.fajr;
    }

    public void setFajr(String str) {
        this.fajr = str;
    }

    public String getSunrise() {
        return this.sunrise;
    }

    public void setSunrise(String str) {
        this.sunrise = str;
    }

    public String getDhuhr() {
        return this.dhuhr;
    }

    public void setDhuhr(String str) {
        this.dhuhr = str;
    }

    public String getAsr() {
        return this.asr;
    }

    public void setAsr(String str) {
        this.asr = str;
    }

    public String getSunset() {
        return this.sunset;
    }

    public void setSunset(String str) {
        this.sunset = str;
    }

    public String getMaghrib() {
        return this.maghrib;
    }

    public void setMaghrib(String str) {
        this.maghrib = str;
    }

    public String getIsha() {
        return this.isha;
    }

    public void setIsha(String str) {
        this.isha = str;
    }

    public String getImsak() {
        return this.imsak;
    }

    public void setImsak(String str) {
        this.imsak = str;
    }

    public String getMidnight() {
        return this.midnight;
    }

    public void setMidnight(String str) {
        this.midnight = str;
    }
}

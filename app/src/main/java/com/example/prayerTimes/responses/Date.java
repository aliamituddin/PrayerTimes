package com.example.prayerTimes.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Date {
    @SerializedName("readable")
    @Expose
    private String readable;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;

    public String getReadable() {
        return this.readable;
    }

    public void setReadable(String str) {
        this.readable = str;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }
}

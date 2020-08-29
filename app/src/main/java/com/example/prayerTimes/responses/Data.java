package com.example.prayerTimes.responses;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("date")
    @Expose
    private Date date;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("timings")
    @Expose
    private Timings timings;

    public Timings getTimings() {
        return timings;
    }

    public void setTimings(Timings timings2) {
        this.timings = timings2;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date2) {
        this.date = date2;
    }

    public Meta getMeta() {
        return this.meta;
    }

    public void setMeta(Meta meta2) {
        this.meta = meta2;
    }
}

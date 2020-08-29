package com.example.prayerTimes.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("latitudeAdjustmentMethod")
    @Expose
    private String latitudeAdjustmentMethod;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("method")
    @Expose
    private Method method;
    @SerializedName("midnightMode")
    @Expose
    private String midnightMode;
    @SerializedName("offset")
    @Expose
    private Offset offset;
    @SerializedName("school")
    @Expose
    private String school;
    @SerializedName("timezone")
    @Expose
    private String timezone;

    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Double d) {
        this.latitude = d;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double d) {
        this.longitude = d;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public Method getMethod() {
        return this.method;
    }

    public void setMethod(Method method2) {
        this.method = method2;
    }

    public String getLatitudeAdjustmentMethod() {
        return this.latitudeAdjustmentMethod;
    }

    public void setLatitudeAdjustmentMethod(String str) {
        this.latitudeAdjustmentMethod = str;
    }

    public String getMidnightMode() {
        return this.midnightMode;
    }

    public void setMidnightMode(String str) {
        this.midnightMode = str;
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String str) {
        this.school = str;
    }

    public Offset getOffset() {
        return this.offset;
    }

    public void setOffset(Offset offset2) {
        this.offset = offset2;
    }
}

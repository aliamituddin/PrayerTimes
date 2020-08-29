package com.example.prayerTimes;

public class SalatDataModel {

    private boolean isTimeOver;
    private String salatEndTime;
    private long salatEndTimeInMS;
    private int salatId;
    private String salatName;
    private String salatStartTime;
    private long salatStartTimeInMS;

    public String getSalatName() {
        return this.salatName;
    }

    public void setSalatName(String str) {
        this.salatName = str;
    }

    public String getSalatStartTime() {
        return this.salatStartTime;
    }

    public void setSalatStartTime(String str) {
        this.salatStartTime = str;
    }

    public String getSalatEndTime() {
        return this.salatEndTime;
    }

    public void setSalatEndTime(String str) {
        this.salatEndTime = str;
    }

    public boolean isTimeOver() {
        return this.isTimeOver;
    }

    public void setTimeOver(boolean z) {
        this.isTimeOver = z;
    }

    public int getSalatId() {
        return this.salatId;
    }

    public void setSalatId(int i) {
        this.salatId = i;
    }


    public long getSalatEndTimeInMS() {
        return salatEndTimeInMS;
    }

    public void setSalatEndTimeInMS(long salatEndTimeInMS) {
        this.salatEndTimeInMS = salatEndTimeInMS;
    }

    public long getSalatStartTimeInMS() {
        return salatStartTimeInMS;
    }

    public void setSalatStartTimeInMS(long salatStartTimeInMS) {
        this.salatStartTimeInMS = salatStartTimeInMS;
    }

}

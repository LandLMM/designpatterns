package com.designpatterns.project;

public class Event {

    public static String LEAVE = "LEAVE";
    public static String TRIP = "TRIP";

    private String eventType; //LEAVE, TRIP

    private String eventStatus; //NEW, ACC, REJ

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }
}
package com.example.soonami;

public class Event {
    public final String title;
    public final long time;
    public final int tsunamiAlert;

    public Event(String eventTitle, long eventTime, int eventTsunami){
        title = eventTitle;
        time = eventTime;
        tsunamiAlert = eventTsunami;
    }


}

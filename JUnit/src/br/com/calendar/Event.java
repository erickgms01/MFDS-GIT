package br.com.calendar;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Event {
    private String title;
    private Date date;
    private String description;
    private List<User> participants;

    public Event(String title, Date date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
        participants = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addParticipant(User participant) {
        participants.add(participant);
    }

    public void removeParticipant(User participant) {
        participants.remove(participant);
    }

    public void listParticipants() {
        for (User participant : participants) {
            System.out.println(participant.getName() + " - " + participant.getEmail());
        }
    }
}

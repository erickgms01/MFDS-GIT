package br.com.calendar;

import java.util.ArrayList;
import java.util.List;

public class CalendarApp {
    private List<Event> events;
    private List<User> users;

    public CalendarApp() {
        events = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void removeEvent(Event event) {
        events.remove(event);
    }

    public List<Event> getEvents() {
        return events;
    }

    public void listEvents() {
        for (Event event : events) {
            System.out.println(event.getTitle() + " - " + event.getDate());
        }
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void listUsers() {
        for (User user : users) {
            System.out.println(user.getName() + " - " + user.getEmail());
        }
    }
}

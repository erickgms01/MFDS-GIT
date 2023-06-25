package br.com.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.calendar.CalendarApp;
import br.com.calendar.Event;
import br.com.calendar.User;

public class TestingCalendar {
    private CalendarApp calendarApp;
    private User user1;
    private User user2;
    private Event event1;
    private Event event2;

    @Before
    public void setup() {
        calendarApp = new CalendarApp();

        // Criando usuários
        user1 = new User("Erick", "erick@example.com", "password123", new Date());
        user2 = new User("Julia", "julinha@example.com", "pass123", new Date());

        // Criando eventos
        event1 = new Event("Aula", new Date(), "Assunto: Geopolítica");
        event2 = new Event("Aniversário", new Date(), "Aniversário da Ana");
    }

    @Test
    public void testAddEvent() {
        calendarApp.addEvent(event1);
        calendarApp.addEvent(event2);
        List<Event> events = calendarApp.getEvents();
        assertEquals(2, events.size());
        assertTrue(events.contains(event1));
        assertTrue(events.contains(event2));
    }

    @Test
    public void testRemoveEvent() {
        calendarApp.addEvent(event1);
        calendarApp.addEvent(event2);
        calendarApp.removeEvent(event1);
        List<Event> events = calendarApp.getEvents();
        assertEquals(1, events.size());
        assertFalse(events.contains(event1));
        assertTrue(events.contains(event2));
    }

    @Test
    public void testListEvents() {
        calendarApp.addEvent(event1);
        calendarApp.addEvent(event2);
        calendarApp.listEvents();
    }

    @Test
    public void testAddUser() {
        calendarApp.addUser(user1);
        calendarApp.addUser(user2);
        List<User> users = calendarApp.getUsers();
        assertEquals(2, users.size());
        assertTrue(users.contains(user1));
        assertTrue(users.contains(user2));
    }

    @Test
    public void testRemoveUser() {
        calendarApp.addUser(user1);
        calendarApp.addUser(user2);
        calendarApp.removeUser(user1);
        List<User> users = calendarApp.getUsers();
        assertEquals(1, users.size());
        assertFalse(users.contains(user1));
        assertTrue(users.contains(user2));
    }

    @Test
    public void testListUsers() {
        calendarApp.addUser(user1);
        calendarApp.addUser(user2);
        calendarApp.listUsers();
    }
}



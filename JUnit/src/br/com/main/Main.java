package br.com.main;

import java.util.Date;

import br.com.calendar.CalendarApp;
import br.com.calendar.Event;
import br.com.calendar.User;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de eventos
        Event event1 = new Event("Aula", new Date(), "assunto: geopolitica");
        Event event2 = new Event("Aniversario", new Date(), "Aniversario da Ana");

        // Criando instâncias de usuários
        User user1 = new User("Erick", "erick@example.com", "password123", new Date());
        User user2 = new User("Julia", "julinha@example.com", "pass123", new Date());

        // Criando instância do aplicativo de calendário
        CalendarApp calendarApp = new CalendarApp();

        // Adicionando eventos ao calendário
        calendarApp.addEvent(event1);
        calendarApp.addEvent(event2);

        // Adicionando usuários ao calendário
        calendarApp.addUser(user1);
        calendarApp.addUser(user2);

        // Listando eventos do calendário
        System.out.println("Eventos do calendário:");
        calendarApp.listEvents();

        // Listando usuários do calendário
        System.out.println("Usuários do calendário:");
        calendarApp.listUsers();
    }
}


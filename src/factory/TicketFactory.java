package factory;

import model.Ticket;

public class TicketFactory {

    public static Ticket create(String title, String description, String priority) {
        return new Ticket(title, description, priority);
    }
}
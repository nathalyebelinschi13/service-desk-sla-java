package service;

import model.Ticket;
import strategy.*;

public class TicketService {

    public void processarTicket(Ticket ticket) {

        PriorityStrategy strategy;

        switch (ticket.getPriority()) {
            case "HIGH":
                strategy = new HighPriority();
                break;
            case "MEDIUM":
                strategy = new MediumPriority();
                break;
            default:
                strategy = new LowPriority();
        }

        strategy.handle();
    }
}
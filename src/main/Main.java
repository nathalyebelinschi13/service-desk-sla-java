package main;

import factory.TicketFactory;
import model.Ticket;
import service.TicketService;
import singleton.TicketQueueManager;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema iniciado");

        Ticket t1 = TicketFactory.create("Internet caiu", "Sem conexão", "HIGH");
        Ticket t2 = TicketFactory.create("Senha bloqueada", "Erro login", "MEDIUM");
        Ticket t3 = TicketFactory.create("PC não liga", "Tela preta", "LOW");

        TicketQueueManager queue = TicketQueueManager.getInstance();

        queue.add(t1);
        queue.add(t2);
        queue.add(t3);

        queue.process();

        TicketService service = new TicketService();
        service.processarTicket(t1);
        service.processarTicket(t2);
        service.processarTicket(t3);
    }
}
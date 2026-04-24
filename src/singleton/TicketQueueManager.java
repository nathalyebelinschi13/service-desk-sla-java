package singleton;

import model.Ticket;
import java.util.LinkedList;
import java.util.Queue;

public class TicketQueueManager {

    private static TicketQueueManager instance;
    private Queue<Ticket> queue;

    private TicketQueueManager() {
        queue = new LinkedList<>();
    }

    public static TicketQueueManager getInstance() {
        if (instance == null) {
            instance = new TicketQueueManager();
        }
        return instance;
    }

    public void add(Ticket ticket) {
        queue.add(ticket);
    }

    public void process() {
        while (!queue.isEmpty()) {
            System.out.println("Processando: " + queue.poll());
        }
    }
}
package strategy;

public class HighPriority implements PriorityStrategy {

    public void handle() {
        System.out.println("URGENTE: atendimento imediato!");
    }
}
package strategy;

public class LowPriority implements PriorityStrategy {

    public void handle() {
        System.out.println("Pode aguardar.");
    }
}
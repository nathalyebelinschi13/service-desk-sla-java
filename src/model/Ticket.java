package model;

public class Ticket {

    private String title;
    private String description;
    private String priority;

    public Ticket(String title, String description, String priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return title + " - " + priority;
    }
}
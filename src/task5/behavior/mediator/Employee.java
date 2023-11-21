package task5.behavior.mediator;

public interface Employee {
    void sendMessage(String message);
    void sendMessage(Transport transport, boolean isRepaired);
    void receiveMessage(String message);
}

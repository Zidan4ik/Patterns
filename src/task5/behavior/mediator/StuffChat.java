package task5.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public class StuffChat implements Mediator {
    private List<Employee> employees = new ArrayList<>();

    public void addToChat(Employee employee) {
        employees.add(employee);
    }

    public void removeFromChat(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void sendMessage(String message, Employee employee) {
        for (Employee emp : employees) {
            if (emp != employee) {
                emp.receiveMessage(message);
            }
        }
    }
}

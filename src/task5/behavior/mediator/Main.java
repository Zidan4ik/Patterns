package task5.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StuffChat chat = new StuffChat();
        Transport transport = new AudiCar("audi", 2020);

        Mechanic roma = new Mechanic(chat, "Roma");
        Mechanic denys = new Mechanic(chat, "Denys");
        Mechanic mainMechanic = new Mechanic(chat, "Ruslan", true);

        chat.addToChat(roma);
        chat.addToChat(denys);
        chat.addToChat(mainMechanic);

        System.out.println("Патерн Mediator");
        System.out.println("Звичайні повідомлення: ");
        roma.sendMessage("Hello");

        System.out.println();

        System.out.println("Повідомлення про машини: ");
        mainMechanic.sendMessage(transport.getTransport(), true);

        System.out.println();
        roma.sendMessage(transport.getTransport(), true);

    }
}

package task5.behavior.mediator;

public class Mechanic implements Employee {
    private Mediator mediator;
    private Transport transport;
    private String name;
    private boolean isMainMechanic;

    public Mechanic(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mechanic(Mediator mediator, String name, boolean isMainMechanic) {
        this.mediator = mediator;
        this.name = name;
        this.isMainMechanic = isMainMechanic;
    }

    @Override
    public void sendMessage(String message) {
        String text = "Механік(" + name + ") надсилає повідомлення: " + message;
        System.out.println(text);

        mediator.sendMessage(text, this);
    }

    @Override
    public void sendMessage(Transport transport, boolean isRepaired) {
        if (isMainMechanic) {
            String message = "Механік(" + name + ") машина: " + transport.getTransport().getMark()
                    + " та року: " + transport.getTransport().getYear();
            System.out.print(message + " ");
            transport.isRepaired(isRepaired);
            mediator.sendMessage(message, this);
        } else {
            System.out.println("Тільки головний механік може використовувати це сповіщення");
        }
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Механік(" + name + ") отримує повідомлення: " + message);
    }
}

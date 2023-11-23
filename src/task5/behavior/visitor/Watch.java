package task5.behavior.visitor;

public class Watch implements Device{
    @Override
    public void notifierMessage(Notifier notifier) {
        System.out.println("Повідомлення прийшло на годинник");
        notifier.notifierWatch();
    }
}

package task5.behavior.visitor;

public class Phone implements Device{
    @Override
    public void notifierMessage(Notifier notifier) {
        System.out.println("Повідомлення прийшло на телефон");
        notifier.notifierPhone();
    }
}

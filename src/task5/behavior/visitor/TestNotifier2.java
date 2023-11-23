package task5.behavior.visitor;

public class TestNotifier2 implements Notifier{
    @Override
    public void notifierPhone() {
        System.out.println("звичайний будильник айфону");
    }

    @Override
    public void notifierWatch() {
        System.out.println("тук тук тук 2");
    }
}

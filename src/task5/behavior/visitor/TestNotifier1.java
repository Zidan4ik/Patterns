package task5.behavior.visitor;

public class TestNotifier1 implements Notifier{
    @Override
    public void notifierPhone() {
        System.out.println("Excuse me, boss, you have a text message!");
    }

    @Override
    public void notifierWatch() {
        System.out.println("тук тук тук");
    }
}

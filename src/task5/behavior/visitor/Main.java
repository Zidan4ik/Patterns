package task5.behavior.visitor;

public class Main {
    public static void main(String[] args) {
        Device phone = new Phone();
        Device watch = new Watch();

        phone.notifierMessage(new TestNotifier1());
        System.out.println();
        watch.notifierMessage(new TestNotifier1());
        System.out.println("---------------");

        phone.notifierMessage(new TestNotifier2());
        System.out.println();
        watch.notifierMessage(new TestNotifier2());
        System.out.println();

    }
}

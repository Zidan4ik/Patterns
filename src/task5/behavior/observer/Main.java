package task5.behavior.observer;

public class Main {
    public static void main(String[] args) {
        Observed tracker = new FitnessTracker();
        Health health = new Health(99,0,0);
        Person roma = new Person("roma",health);
        Observer doctor = new Person("doctor",health);

        tracker.add(roma);
        tracker.add(doctor);
        System.out.println("Повідомлення перше:");
        tracker.notifyPersons();

        health.changingHealth(120,500,200);
        System.out.println("Повідомлення друге:");
        tracker.notifyPersons();

    }
}

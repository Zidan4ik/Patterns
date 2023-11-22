package task5.behavior.observer;

public class Main {
    public static void main(String[] args) {
        Observed tracker = new FitnessTracker();
        Health healthRoman = new Health(99,0,0);
        Person roma = new Person("roma",healthRoman);
        Observer doctor = new Person("doctor",healthRoman);

        tracker.add(roma);
        tracker.add(doctor);

        System.out.println("Патерн Observer");
        System.out.println("Повідомлення перше:");
        tracker.notifyPersons();

        healthRoman.changingHealth(120,500,200);
        System.out.println("Повідомлення друге:");
        tracker.notifyPersons();

    }
}

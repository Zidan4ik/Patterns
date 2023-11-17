package task5.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Psychologist psy = Psychologist.getInstance();
        Psychologist psy2 = Psychologist.getInstance();

        psy.workTime("Denys",2);
        psy.workTime("Mark",1);
//        Psychologist psy2 = new Psychologist();
    }
}

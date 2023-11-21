package task5.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class FitnessTracker implements Observed{
    private List<Observer> people = new ArrayList<>();
    @Override
    public void add(Observer person) {
        people.add(person);
    }

    @Override
    public void remove(Observer person) {
        people.remove(person);
    }

    @Override
    public void notifyPersons() {
        for(Observer person: people){
            person.showInfo();
            System.out.println("------------------");
        }
    }
}

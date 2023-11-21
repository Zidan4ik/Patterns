package task5.behavior.observer;

public interface Observed {
    void add(Observer person);
    void remove(Observer person);
    void notifyPersons();
}

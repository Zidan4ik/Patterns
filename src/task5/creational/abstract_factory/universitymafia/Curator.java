package task5.creational.abstract_factory.universitymafia;

import task5.creational.abstract_factory.PersonCitizen;
import task5.creational.abstract_factory.PersonDoctor;

public class Curator implements PersonDoctor {
    @Override
    public void act() {
        System.out.println("Куратор хоче врятувати студента від відрахування");
    }
}

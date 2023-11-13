package task5.creational.abstract_factory.standardmafia;

import task5.creational.abstract_factory.PersonCitizen;
import task5.creational.abstract_factory.PersonDoctor;

public class Doctor implements PersonDoctor {
    @Override
    public void act() {
        System.out.println("Доктор сьогодні на своїй зміні");
    }
}

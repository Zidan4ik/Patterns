package task5.creational.abstract_factory.standardmafia;

import task5.creational.abstract_factory.PersonCitizen;

public class Citizen implements PersonCitizen {
    @Override
    public void act() {
        System.out.println("Мирний житель гуляє по місту");
    }
}

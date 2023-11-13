package task5.creational.abstract_factory.universitymafia;

import task5.creational.abstract_factory.PersonCitizen;

public class Student implements PersonCitizen {
    @Override
    public void act() {
        System.out.println("Студент спить на парі");
    }
}

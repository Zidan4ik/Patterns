package task5.creational.abstract_factory.universitymafia;

import task5.creational.abstract_factory.PersonDon;

public class Dean implements PersonDon {
    @Override
    public void act() {
        System.out.println("Декан хоче відрахувати студента, який спить");
    }
}

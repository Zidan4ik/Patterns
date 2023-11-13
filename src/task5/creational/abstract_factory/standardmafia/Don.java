package task5.creational.abstract_factory.standardmafia;

import task5.creational.abstract_factory.PersonDon;

public class Don implements PersonDon {
    @Override
    public void act() {
        System.out.println("Дон шукає шерифа і хоче вбити мирного жителя");
    }
}

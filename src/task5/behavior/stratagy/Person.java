package task5.behavior.stratagy;

import java.time.LocalDate;

public class Person {
    private String name;
    private int age;
    private LocalDate date;

    public Person(String name, int age, LocalDate date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDate() {
        return date;
    }
}

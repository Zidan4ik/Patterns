package task5.structure.flyweight;

public class NumberContact implements Contact{
    String name;
    String number;

    public NumberContact(String name, String number) {
        System.out.println("Створений номер унікальний для: "+name);
        this.name = name;
        this.number = number;
    }

    @Override
    public void showInfo() {
        System.out.println("Ім'я: "+name +", номер: "+number);
    }
}

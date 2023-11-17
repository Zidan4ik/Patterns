package task5.structure.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactoryNumber factory = new FactoryNumber();

        Contact roma = factory.getContact("roma","0982370190");
        Contact roma2 = factory.getContact("roma","0982370190");
        Contact denys = factory.getContact("denys","0983512350");
        Contact andriy = factory.getContact("andriy","0945618455");

        roma.showInfo();
        roma2.showInfo();
        denys.showInfo();
        andriy.showInfo();


    }
}

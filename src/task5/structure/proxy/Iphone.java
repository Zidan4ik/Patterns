package task5.structure.proxy;

import java.util.HashMap;
import java.util.Map;

public class Iphone implements Phone{
    private String name;
    public Iphone(String name) {
        this.name = name;
    }
    @Override
    public void call(String phone) {
        System.out.println("Телефонуємо: "+phone + ".....");
    }
    @Override
    public void sendMessage(String message, String phone) {
        System.out.println("Відправляємо повідомлення ["+message+"] за номером: "+phone+"....");
    }
}

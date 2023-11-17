package task5.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FactoryNumber {
    private final Map<String, Contact> contacts = new HashMap<>();

    public Contact getContact(String name,String phone){

        String key = name+"-"+phone;
        if(!contacts.containsKey(key)){
        contacts.put(key,new NumberContact(name,phone));
        }

        return contacts.get(key);
    }
}

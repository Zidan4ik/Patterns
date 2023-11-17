package task5.structure.facade;

public class Phone {
    String name;
    int brightness;
    int battery;
    boolean isOff=false;

    public Phone(String name, int brightness, int battery) {
        this.name = name;
        this.brightness = brightness;
        this.battery = battery;
    }
    public void isOff(){
        if(!isOff){
            System.out.println("Телефон потрібно включити");
        }
    }
    public void on(){
        System.out.println("телефон увімкнувся");
        isOff=true;
    }
    public void off(){
        System.out.println("телефон вимкнувся");
        isOff=true;
    }

}

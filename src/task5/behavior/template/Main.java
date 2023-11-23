package task5.behavior.template;

public class Main {
    public static void main(String[] args) {
        Device laptop = new Laptop("roma");
        laptop.sendMessage("Hello bro))","andriy");
        System.out.println();
        Device iphone = new Iphone(1234);
        iphone.sendMessage("just go to university","maria");
    }
}

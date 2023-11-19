package task5.structure.proxy;

public class Main {
    public static void main(String[] args) {
        Phone phone = new ProxyPhone(false);

        phone.call("roma");
        phone.sendMessage("hello","roma");
    }
}

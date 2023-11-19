package task5.behavior.changeofresponsibility;

public class NoMessage extends Tesla {
    public NoMessage(int speed) {
        super(speed);
    }
    @Override
    public void method(String message) {
        System.out.println("Дія транспорту: "+ message);
    }
}

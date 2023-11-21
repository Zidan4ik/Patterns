package task5.behavior.change_of_responsibility;

public class NoMessage extends Tesla {
    public NoMessage(int speed) {
        super(speed);
    }
    @Override
    public void messageDo(String message) {
        System.out.println("Дія транспорту: "+ message);
    }
}

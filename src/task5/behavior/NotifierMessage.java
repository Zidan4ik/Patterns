package task5.behavior;

public class NotifierMessage extends Tesla {
    public NotifierMessage(int speed) {
        super(speed);
    }
    @Override
    public void method(String message) {
        System.out.println("Повідолення на екрані: "+message);
    }
}

package task5.behavior.changeofresponsibility;

public class SoundMessage extends Tesla {
    public SoundMessage(int speed) {
        super(speed);
    }
    @Override
    public void method(String message) {
        System.out.println("Звукове повідомлення: "+message);
    }
}
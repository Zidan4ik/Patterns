package task5.behavior.change_of_responsibility;

public class SoundMessage extends Tesla {
    public SoundMessage(int speed) {
        super(speed);
    }
    @Override
    public void messageDo(String message) {
        System.out.println("Звукове повідомлення: "+message);
    }
}

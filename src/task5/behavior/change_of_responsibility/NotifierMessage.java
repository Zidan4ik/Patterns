package task5.behavior.change_of_responsibility;

public class NotifierMessage extends Tesla {
    public NotifierMessage(int speed) {
        super(speed);
    }
    @Override
    public void messageDo(String message) {
        System.out.println("Повідолення на екрані: "+message);
    }
}

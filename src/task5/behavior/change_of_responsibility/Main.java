package task5.behavior.change_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Tesla notifierMessage = new NotifierMessage(90);
        Tesla soundMessage = new SoundMessage(120);
        Tesla noMessage = new NoMessage(150);

        notifierMessage.setTesla(soundMessage);
        soundMessage.setTesla(noMessage);

        System.out.println("Патерн chain of responsibility\n");
        System.out.println("Реакція тесли 1: ");
        notifierMessage.notifier("будь ласка зменшіть швидкість",100);
        System.out.println("Реакція тесли 2: ");
        notifierMessage.notifier("будь ласка зменшіть швидкість ви надто швидко рухаєтесь!",135);
        System.out.println("Реакція тесли 3: ");
        notifierMessage.notifier("забирає кермо автопілот,тому що водій надто швидко рухався",200);

    }
}

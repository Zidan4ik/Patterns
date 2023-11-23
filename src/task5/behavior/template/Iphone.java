package task5.behavior.template;

public class Iphone extends Device {
    private boolean unblock;
    public int code;

    public Iphone(int code) {
        this.code = code;
    }

    @Override
    public void on() {
        this.setOff(false);
        System.out.println("айфон включився");
    }

    @Override
    public void unblock() {
        if(this.code==1234){
            System.out.println("айфон розблокувався");
            unblock= true;
        } else {
            System.out.println("неправильно введений пароль!");
            unblock= false;
        }
    }

    @Override
    public void openProgram() {
        if(unblock){
            System.out.println("Відкриваємо messenger");
        }
    }

    @Override
    public void send(String message, String name) {
        if(unblock){
            System.out.println("Ви надіслали повідомлення: "+message+".\nДля: "+name);
        }
    }
}

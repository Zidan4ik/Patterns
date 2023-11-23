package task5.behavior.template;

public class Laptop extends Device{
    private boolean unblock;
    private String code;

    public Laptop(String code) {
        this.code = code;
    }

    @Override
    public void on() {
        this.setOff(false);
        System.out.println("ноутбук включився");
    }

    @Override
    public void unblock() {
        if(this.code=="roma"){
            System.out.println("ноутбук розблокувався");
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

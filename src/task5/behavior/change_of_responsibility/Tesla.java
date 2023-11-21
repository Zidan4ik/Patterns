package task5.behavior.change_of_responsibility;

public abstract class Tesla {
    private int speed;
    private Tesla tesla;

    public Tesla(int speed) {
        this.speed = speed;
    }

    public void setTesla(Tesla tesla) {
        this.tesla = tesla;
    }
    public void notifier(String message,int speed){
        if(speed>=this.speed){
            messageDo(message);
        }
        if(tesla!=null){
            tesla.notifier(message,speed);
        }
    }
    public abstract void messageDo(String message);
}

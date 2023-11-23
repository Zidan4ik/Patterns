package task5.behavior.template;

public abstract class Device {
    private boolean isOff;
    public final void sendMessage(String message, String name){
        on();
        unblock();
        openProgram();
        send(message, name);
    }

    public void setOff(boolean off) {
        isOff = off;
    }
    public boolean isOff() {
        return isOff;
    }


    public abstract void on();
    public abstract void unblock();
    public abstract void openProgram();
    public abstract void send(String message, String name);

}

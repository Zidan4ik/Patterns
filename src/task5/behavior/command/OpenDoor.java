package task5.behavior.command;


public class OpenDoor implements CommandTransport {
    Tesla tesla;
    public OpenDoor(Tesla tesla) {
        this.tesla = tesla;
    }
    @Override
    public void execute() {
        tesla.openDoor();
    }
}

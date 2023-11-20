package task5.behavior.command;

public class CloseDoor implements CommandTransport{
    Tesla tesla;

    public CloseDoor(Tesla tesla) {
        this.tesla = tesla;
    }

    @Override
    public void execute() {
        tesla.closeDoor();
    }
}

package task5.behavior.command;

public class ChangeAutoPilot implements CommandTransport{
    Tesla tesla;

    public ChangeAutoPilot(Tesla tesla) {
        this.tesla = tesla;
    }

    @Override
    public void execute() {
        tesla.changeDriver(false);
    }
}

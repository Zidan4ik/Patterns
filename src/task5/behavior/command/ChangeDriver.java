package task5.behavior.command;

public class ChangeDriver implements CommandTransport{
    Tesla tesla;

    public ChangeDriver(Tesla tesla) {
        this.tesla = tesla;
    }

    @Override
    public void execute() {
        tesla.changeDriver(true);
    }
}

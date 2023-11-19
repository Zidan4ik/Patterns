package task5.behavior.command;


public class DoorOperations implements Transport{
    Tesla tesla;

    public DoorOperations(Tesla tesla) {
        this.tesla = tesla;
    }

    @Override
    public void execute() {
        tesla.openDoor();
    }
}

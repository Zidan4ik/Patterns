package task5.behavior.command;

public class RemoteControl {
    private CommandTransport openDoor;
    private CommandTransport closeDoor;
    private CommandTransport driveAutoPilot;
    private CommandTransport drivePerson;

    public RemoteControl(CommandTransport openDoor, CommandTransport closeDoor, CommandTransport driveAutoPilot, CommandTransport drivePerson) {
        this.openDoor = openDoor;
        this.closeDoor = closeDoor;
        this.driveAutoPilot = driveAutoPilot;
        this.drivePerson = drivePerson;
    }

    public void openDoor() {
        openDoor.execute();
    }

    public void closeDoor() {
        closeDoor.execute();
    }

    public void changeDriver() {
        driveAutoPilot.execute();
    }
    public void changeAutoPilot(){ drivePerson.execute();}
}

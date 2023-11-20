package task5.behavior.command;

public class Main {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();

        RemoteControl control = new RemoteControl(new OpenDoor(tesla),
                new CloseDoor(tesla), new ChangeDriver(tesla), new ChangeAutoPilot(tesla));

        System.out.println("Патерн Command\n");
        control.openDoor();
        control.closeDoor();
        control.changeDriver();
        control.changeAutoPilot();
    }
}

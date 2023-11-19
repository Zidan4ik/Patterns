package task5.behavior.command;

public class Main {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        Transport transport = new DoorOperations(tesla);

        PromoteControls controls = new PromoteControls();
        controls.setTransport(transport);
        controls.pressButton();
    }
}

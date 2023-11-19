package task5.behavior.command;

public class PromoteControls {
    Transport transport;

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
    void pressButton(){
        transport.execute();
    }
}

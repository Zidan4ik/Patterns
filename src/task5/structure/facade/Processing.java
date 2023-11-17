package task5.structure.facade;

public class Processing {
    private Phone phone;
    private Battery battery;
    private Brightness brightness;

    public Processing(Phone phone) {
        this.phone = phone;
        this.battery= new Battery(phone);
        this.brightness= new Brightness(phone);
    }

    void chargePhone(int minutes){
        phone.isOff();
        battery.charge(minutes);
    }
    void dischargePhone(int minutes){
        phone.isOff();
        battery.discharge(minutes);
    }
    void offPhone(){
        phone.off();
    }
    void onPhone(){phone.on();}
}

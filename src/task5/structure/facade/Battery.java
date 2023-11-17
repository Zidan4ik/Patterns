package task5.structure.facade;

public class Battery {
    private Phone phone;

    public Battery(Phone phone) {
        this.phone = phone;
    }
    public void discharge(int minutes){
        if(!phone.isOff){
            System.out.println("Для зміни яркості екрану потрібно включити або зарядити телефон");
        }else{
            System.out.println("Просиділи в телефоні "+minutes+"хв.");
            phone.battery-= 0.5*minutes;
            System.out.println("Батаррея телефона: "+phone.battery+"%");
        }
    }
    public void charge(int minutes){
        if(!phone.isOff){
            System.out.println("Телефон розряжений");
        }else{
            System.out.println("Батарея телефона: "+phone.battery+"%");
        }
        phone.battery+= 1.5*minutes;
        System.out.println("Телефон пробув на зарядці "+minutes+"хв. Батарея: "+phone.battery);
    }
}

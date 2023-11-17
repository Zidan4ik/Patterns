package task5.structure.facade;

public class Brightness {
    private Phone phone;
    public Brightness(Phone phone) {
        this.phone = phone;
    }
    public void increase(int percent){
        if(!phone.isOff){
            System.out.println("Потрібно включити телефон");
        }else{
            phone.brightness+=percent;
            System.out.println("Яскравість телефон змінилась на "+phone.brightness+"%");
        }
    }
    public void reduce(int percent){
        if(!phone.isOff){
            System.out.println("Потрібно включити телефон");
        }else{
            phone.brightness-=percent;
            System.out.println("Яскравість телефон змінилась на "+phone.brightness+"%");
        }
    }
}

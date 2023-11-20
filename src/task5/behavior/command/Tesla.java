package task5.behavior.command;

public class Tesla {
    public void changeDriver(boolean isAutoPilot){
        if(isAutoPilot){
            System.out.println("Теслою керує автопілот");
        }else{
            System.out.println("Теслою керує справжні водій");
        }
    }
    public void openDoor(){
        System.out.println("Машина відкриває двері");
    }
    public void closeDoor(){
        System.out.println("Машина закриває двері");
    }
}

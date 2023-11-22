package task5.behavior.state;

public class Red implements Color{
    private int count;
    @Override
    public void act(TrafficLight traffic) {
        if(count == 5){
            traffic.setColor(new Yellow());
            count=0;
            System.out.println();
        }else{
        count++;
        System.out.println("Блимання червоним коліром");}
    }
}

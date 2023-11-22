package task5.behavior.state;

public class Green implements Color{
    private int count;
    @Override
    public void act(TrafficLight traffic) {
        if(count == 8){
            traffic.setColor(new Red());
            count=0;
            System.out.println();
        }else{
        count++;
        System.out.println("Блимання зеленим кольором");}
    }
}

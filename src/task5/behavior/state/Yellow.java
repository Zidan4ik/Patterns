package task5.behavior.state;

public class Yellow implements Color {
    private int count;

    @Override
    public void act(TrafficLight traffic) {
        if (count == 3) {
            traffic.setColor(new Green());
            count = 0;
            System.out.println();
        } else {
            count++;
            System.out.println("Блимання жовтим кольором");
        }
    }
}

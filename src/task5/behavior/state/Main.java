package task5.behavior.state;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(new Green());
        for(int i=0;i<20;i++){
            trafficLight.blinkingColor();
        }
    }
}

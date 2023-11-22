package task5.behavior.state;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(new Green());

        System.out.println("Патерн State");
        for(int i=0;i<25;i++){
            trafficLight.blinkingColor();
        }
    }
}

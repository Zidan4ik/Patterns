package task5.behavior.state;

public class TrafficLight {
    private Color color;

    public TrafficLight(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void blinkingColor() {
        if (color instanceof Color) {
            color.act(this);
        }
    }
}

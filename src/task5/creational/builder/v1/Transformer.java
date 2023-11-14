package task5.creational.builder.v1;

public class Transformer {
    private String name;
    private String color;
    private boolean isTransformationCar;
    private boolean isTransformationAirplane;
    private boolean isTransformationTank;
    private boolean isAutoBot;

    public Transformer() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransformationCar(boolean transformationCar) {
        isTransformationCar = transformationCar;
    }

    public void setTransformationAirplane(boolean transformationAirplane) {
        isTransformationAirplane = transformationAirplane;
    }

    public void setTransformationTank(boolean transformationTank) {
        isTransformationTank = transformationTank;
    }

    public void setAutoBot(boolean autoBot) {
        isAutoBot = autoBot;
    }

    @Override
    public String toString() {
        return "Transformer{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", isTransformationCar=" + isTransformationCar +
                ", isTransformationAirplane=" + isTransformationAirplane +
                ", isTransformationTank=" + isTransformationTank +
                ", isAutoBot=" + isAutoBot +
                '}';
    }
}

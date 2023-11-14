package task5.creational.builder.v1;

public interface TransformerBuilder {
    void buildName();
    void buildColor();
    void buildIsAirPlane();
    void buildIsCar();
    void buildIsTank();
    void buildIsAutobot();
    Transformer info();
}

package task5.creational.builder;

public interface TransformerBuilder {

    void buildColor(String color);
    void transport(Transport transport);
    void buildIsAutobot(boolean isAutoBot);
    Transformer info();
}

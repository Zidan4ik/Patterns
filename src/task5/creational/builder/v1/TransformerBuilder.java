package task5.creational.builder.v1;

public interface TransformerBuilder {
    void buildName();
    void buildColor();
    void transport();
    void buildIsAutobot();
    Transformer info();
}

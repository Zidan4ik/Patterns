package task5.creational.builder;

public class Director {
    private TransformerBuilder transformerBuilder;

    public Director(TransformerBuilder transformerBuilder) {
        this.transformerBuilder = transformerBuilder;
    }
    void buildAutoBot(){
        transformerBuilder.buildColor("grey");
        transformerBuilder.transport(Transport.car);
        transformerBuilder.buildIsAutobot(true);
    }
    void buildDeception(){
        transformerBuilder.buildColor("black");
        transformerBuilder.transport(Transport.airplane);
        transformerBuilder.buildIsAutobot(false);
    }
}

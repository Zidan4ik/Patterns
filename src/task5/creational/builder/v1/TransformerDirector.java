package task5.creational.builder.v1;

public class TransformerDirector {
    private TransformerBuilder transformerBuilder;

    public TransformerDirector(TransformerBuilder transformerBuilder) {
        this.transformerBuilder = transformerBuilder;
    }
    void buildTransformer(){
        transformerBuilder.buildName();
        transformerBuilder.buildColor();
        transformerBuilder.transport();
        transformerBuilder.buildIsAutobot();
    }
}

package task5.creational.builder.v1;

public class TransformerAutoBot implements TransformerBuilder {
    private Transformer transformer = new Transformer();

    @Override
    public void buildName() {
        transformer.setName("Оптімус");
    }

    @Override
    public void buildColor() {
        transformer.setColor("синій");
    }

    @Override
    public void transport() {
        transformer.setBody(Transport.car);
    }

    @Override
    public void buildIsAutobot() {
        transformer.setAutoBot(true);
    }


    @Override
    public Transformer info() {
        return transformer;
    }
}

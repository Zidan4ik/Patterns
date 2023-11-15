package task5.creational.builder.v1;

public class TransformerAutoBot implements TransformerBuilder {
    private Transformer transformer = new Transformer();

    @Override
    public void buildName() {
        transformer.setName("Autobot");
    }

    @Override
    public void buildColor() {
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

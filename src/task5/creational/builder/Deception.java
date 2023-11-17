package task5.creational.builder;

public class Deception implements TransformerBuilder {
    private Transformer transformer = new Transformer();


    @Override
    public void buildColor(String color) {
        transformer.setColor(color);
    }

    @Override
    public void transport(Transport transport) {
        transformer.setBody(transport);
    }
    @Override
    public void buildIsAutobot(boolean isAutoBot) {
        transformer.setAutoBot(isAutoBot);
    }

    @Override
    public Transformer info() {
        return transformer;
    }
}
